package pe.com.claro.common.property;

import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import javax.ws.rs.core.HttpHeaders;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ClaroUtil {
	private static final Logger LOG = LoggerFactory.getLogger(ClaroUtil.class);

	public static String getHttpHeadersNoNull(HttpHeaders httpHeaders) {
		String idTransaccion = httpHeaders.getRequestHeader(Constantes.IDTRANSACCION) != null
				? httpHeaders.getRequestHeader(Constantes.IDTRANSACCION).get(0) : "";
		String msgid = httpHeaders.getRequestHeader(Constantes.MSGID) != null ? httpHeaders.getRequestHeader(Constantes.MSGID).get(0)
				: "";
		String timestamp =  "";				
		Calendar a = ClaroUtil.toCalendar( httpHeaders.getRequestHeader( Constantes.TIMESTAMP ) != null? httpHeaders.getRequestHeader( Constantes.TIMESTAMP ).get( 0 ).toString(): Constantes.TEXTOVACIO );
		if( a != null )
			timestamp = a.getTime().toString();
		String userId = httpHeaders.getRequestHeader(Constantes.USRID) != null ? httpHeaders.getRequestHeader(Constantes.USRID).get(0) : "";
		String accept = httpHeaders.getRequestHeader(Constantes.ACCEPT) != null ? httpHeaders.getRequestHeader(Constantes.ACCEPT).get(0) : "";
		StringBuffer data = new StringBuffer();
		data.append("["+Constantes.IDTRANSACCION+"=");
		data.append(idTransaccion);
		data.append(" " + Constantes.MSGID+"=");
		data.append(msgid);		
		data.append(" "+Constantes.TIMESTAMP+"=");
		data.append(timestamp);
		data.append(" "+Constantes.USRID+"=");
		data.append(userId);
		data.append(" "+Constantes.ACCEPT+"=");
		data.append(accept);
		data.append(Constantes.CORCHETE);
		return data.toString();
	}

	public static String getHttpHeaders(HttpHeaders httpHeaders) {
		
		if(httpHeaders.getRequestHeader(Constantes.IDTRANSACCION) == null) return null;
		if(httpHeaders.getRequestHeader(Constantes.MSGID) == null) return null;
		if(httpHeaders.getRequestHeader(Constantes.TIMESTAMP) == null) return null;
		if(httpHeaders.getRequestHeader(Constantes.USRID) == null) return null;
		
		String idTransaccion = httpHeaders.getRequestHeader(Constantes.IDTRANSACCION) != null
				? httpHeaders.getRequestHeader(Constantes.IDTRANSACCION).get(0) : "";
		String msgid = httpHeaders.getRequestHeader(Constantes.MSGID) != null ? httpHeaders.getRequestHeader(Constantes.MSGID).get(0)
				: "";
		String timestamp = httpHeaders.getRequestHeader(Constantes.TIMESTAMP) != null
				? httpHeaders.getRequestHeader(Constantes.TIMESTAMP).get(0) : "";
		String userId = httpHeaders.getRequestHeader(Constantes.USRID) != null ? httpHeaders.getRequestHeader(Constantes.USRID).get(0)
				: "";

		StringBuffer data = new StringBuffer();
		data.append("["+Constantes.IDTRANSACCION+"=");
		data.append(idTransaccion);
		data.append(" " + Constantes.MSGID+"=");
		data.append(msgid);		
		data.append(" "+Constantes.TIMESTAMP+"=");
		data.append(timestamp);
		data.append(" "+Constantes.USRID+"=");
		data.append(userId);
		data.append(" "+Constantes.ACCEPT+"=");
		data.append(httpHeaders.getMediaType());
		data.append(Constantes.CORCHETE);
		return data.toString();
	}

	public static String nuloAVacio(Object object) {

		if (object == null) {
			return Constantes.TEXTO_VACIO;
		} else {
			return object.toString();
		}
	}
	
	public static Object nuloAVacioObject(Object object){
		if (object == null) {
			return Constantes.TEXTO_VACIO;
		} else {
			return object;
		}
	}

	public static String verifiyNull(Object object) {
		String a = null;
		if (object != null) {
			a = object.toString();
		}
		return a;
	}
	
	public static String convertProperties(Object object){
		String a = null;
		if (object != null) {
			a = object.toString();
			try {
				a = new String(a.getBytes(Constantes.DEFAULTENCONDIGPROPERTIES), Constantes.DEFAULTENCONDINGAPI);
			} catch (Exception e) {
				LOG.error("Error getProperties Encoding Failed, trayendo Encoding por defecto",e );
			}
		}
		return a;
	}

	public static Integer convertirInteger(Object object) {
		
		Integer res = null;
		if (object != null) {
			if (object instanceof BigDecimal) {
				BigDecimal bd = (BigDecimal) object;
				res = bd.intValueExact();
			} else {
				System.out.println(object.getClass().getSimpleName());
			}
		}
		return res;
	}

	public static Float convertirFloat(Object object) {
		Float res = null;
		if (object != null) {
			if (object instanceof BigDecimal) {
				BigDecimal bd = (BigDecimal) object;
				res = bd.floatValue();
			}
		}
		return res;
	}
	
	/**
     * Genera un String a partir de un Date, si fecha es NULL retorna ""
     * (vacio).
     *
     * @param fecha tipo Date
     * @return String de la forma dd/MM/yyyy
     */
    public static String dateAString(Date fecha) {
        if (fecha == null) {
            return Constantes.TEXTO_VACIO;
        }
        return dateAString(fecha, Constantes.FORMATOFECHADEFAULT);
    }

    
    /**
     * Genera un String a partir de un Date de acuerdo al fomrato enviado, si
     * fecha es NULL toma la fecha actual.
     *
     * @param fecha
     * @param formato
     * @return
     */
    public static String dateAString(Date fecha, String formato) {
        SimpleDateFormat formatoDF = new SimpleDateFormat(formato, Locale.ROOT);
        return formatoDF.format(fecha);
    }
    
    public static Calendar toCalendar(final String iso8601string){
        Calendar calendar = GregorianCalendar.getInstance();
        String s = iso8601string.replace("Z", "+00:00");
        try {
            s = s.substring(0, 22) + s.substring(23);  // to get rid of the ":"
            Date date = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssZ", Locale.ROOT).parse(s);
            calendar.setTime(date);
        } catch (IndexOutOfBoundsException e) {
        	LOG.error("Ocurrio un error al recorrer la cadena de Fecha" , e);
        	calendar = null;
        } catch (ParseException e) {
        	LOG.error("Ocurrio un error al convertir a Date la cadena de la fecha" , e);
        	calendar = null;
		}
        return calendar;
    }
    
    public static boolean isValidFormat(String format, String value) {
        Date date = null;
        try {
            SimpleDateFormat sdf = new SimpleDateFormat(format, Locale.ROOT);
            date = sdf.parse(value);
            if (!value.equals(sdf.format(date))) {
                date = null;
            }
        } catch (ParseException ex) {
        	date = null;
        }
        return date != null;
    }
    
    public static Date getValidFormatDate(String format, String value) {
        Date date = null;
        if (value != null && !value.isEmpty()) {
        	try {
                SimpleDateFormat sdf = new SimpleDateFormat(format, Locale.ROOT);
                date = sdf.parse(value);
                if (!value.equals(sdf.format(date))) {
                    date = null;
                }
            } catch (ParseException ex) {
            	date = null;
            }
		}
        return date;
    }
}