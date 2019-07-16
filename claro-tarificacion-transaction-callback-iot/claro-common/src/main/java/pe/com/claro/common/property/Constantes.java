package pe.com.claro.common.property;

public class Constantes{

	public static final String	NOMBRERECURSO						= "claro-vent-ventas";
	public static final String	SEPARADORPUNTO						= ".";
	public static final String	VERSION								= "1.0.0";
	public static final String	PATH								= "/vent/venta/v1.0.0/ventas";
	public static final String	BASEPATH							= "claro-vent-ventas-resource/api";
	public static final String	RESOURCE							= "/ventas";
	public static final String	DESCRIPCIONRESOURCE					= "Operaciones sobre ventas";
	public static final String	NOMBREMETODO1						= "insertarVenta";
	public static final String	PATHMETODO1							= "/";
	public static final String	DESCRIPCIONMETODO1					= "Insertar venta";
	public static final String	NOTASMETODO1						= "Inserta venta";
	public static final String	NOMBREMTODO2						= "actualizarAnulaVenta";
	public static final String	PATHMETODO2							= "/anulacion";
	public static final String	DESCRIPCIONMETODO2					= "Anula una venta";
	public static final String	NOTASMETODO2						= "Anula una venta";
	public static final String	NOMBREMETODO3						= "obtenerDatosVenta";
	public static final String	PATHMETODO3							= "/";
	public static final String	DESCRIPCIOMETODO3					= "Obtener lista de ventas";
	public static final String	NOTASMETODO3						= "Obtener lista de ventas";
	public static final String	ID									= "id";
	public static final String	TEXTONULL							= "null";
	public static final String	TEXTOVACIO							= "";

	public static final String	FORMATOFECHADEFAULT					= "dd/MM/yyyy HH:mm:ss";
	// ----------------
	public static final String	CODIGO200							= "200";
	public static final String	CODIGO400							= "400";
	public static final String	CODIGO404							= "404";
	public static final String	MENSAJEOK							= "OK";

	// -----------------
	public static final String	INSERTARVENTA_CODIGO_IDF0			= "0";
	public static final String	INSERTARVENTA_MENSAJE_IDF0			= "Respuesta exitosa";
	public static final String	INSERTARVENTA_CODIGO_IDF1			= "1";
	public static final String	INSERTARVENTA_MENSAJE_IDF1			= "Se debe enviar campos obligatorios.";
	public static final String	INSERTARVENTA_CODIGO_IDT1			= "-1";
	public static final String	INSERTARVENTA_MENSAJE_IDT1			= "Los tipos de datos enviados son incorrectos.";
	public static final String	INSERTARVENTA_CODIGO_IDT2			= "-2";
	public static final String	INSERTARVENTA_MENSAJE_IDT2			= "Error de disponibilidad la BD MSSINCDB ";
	public static final String	INSERTARVENTA_CODIGO_IDT3			= "-3";
	public static final String	INSERTARVENTA_MENSAJE_IDT3			= "Ocurrió un error inesperado. ";
	// -----------------
	public static final String	ACTUALIZARANULAVENTA_CODIGO_IDF0	= "0";
	public static final String	ACTUALIZARANULAVENTA_MENSAJE_IDF0	= "Respuesta exitosa";
	public static final String	ACTUALIZARANULAVENTA_CODIGO_IDF1	= "1";
	public static final String	ACTUALIZARANULAVENTA_MENSAJE_IDF1	= "La consulta no encontró registros de venta";
	public static final String	ACTUALIZARANULAVENTA_CODIGO_IDF2	= "1";
	public static final String	ACTUALIZARANULAVENTA_MENSAJE_IDF2	= "Se debe enviar campos obligatorios.";
	public static final String	ACTUALIZARANULAVENTA_CODIGO_IDT1	= "-1";
	public static final String	ACTUALIZARANULAVENTA_MENSAJE_IDT1	= "Los tipos de datos enviados son incorrectos";
	public static final String	ACTUALIZARANULAVENTA_CODIGO_IDT2	= "-2";
	public static final String	ACTUALIZARANULAVENTA_MENSAJE_IDT2	= "Error de disponibilidad la BD MSSINCDB ";
	public static final String	ACTUALIZARANULAVENTA_CODIGO_IDT3	= "-3";
	public static final String	ACTUALIZARANULAVENTA_MENSAJE_IDT3	= "Ocurrió un error inesperado";
	// -----------------
	public static final String	OBTENERDATOSVENTA_CODIGO_IDF0		= "0";
	public static final String	OBTENERDATOSVENTA_MENSAJE_IDF0		= "Respuesta exitosa";
	public static final String	OBTENERDATOSVENTA_CODIGO_IDF1		= "1";
	public static final String	OBTENERDATOSVENTA_MENSAJE_IDF1		= "La consulta no encontró registros de venta.";
	public static final String	OBTENERDATOSVENTA_CODIGO_IDF2		= "2";
	public static final String	OBTENERDATOSVENTA_MENSAJE_IDF2		= "Se debe enviar campos obligatorios.";
	public static final String	OBTENERDATOSVENTA_CODIGO_IDF3		= "3";
	public static final String	OBTENERDATOSVENTA_MENSAJE_IDF3		= "Solo se puede filtrar por un campo a la vez";
	public static final String	OBTENERDATOSVENTA_CODIGO_IDT1		= "-1";
	public static final String	OBTENERDATOSVENTA_MENSAJE_IDT1		= "Los tipos de datos enviados son incorrectos.";
	public static final String	OBTENERDATOSVENTA_CODIGO_IDT2		= "-2";
	public static final String	OBTENERDATOSVENTA_MENSAJE_IDT2		= "Error de disponibilidad la BD MSSINCDB";
	public static final String	OBTENERDATOSVENTA_CODIGO_IDT3		= "-3";
	public static final String	OBTENERDATOSVENTA_MENSAJE_IDT3		= "Ocurrió un error inesperado";
	public static final String	OBTENERDATOSVENTA_CODIGO_IDT4		= "-4";
	public static final String	OBTENERDATOSVENTA_MENSAJE_IDT4		= "Error de disponibilidad en el WS Localizaciones";
	public static final String	OBTENERDATOSVENTA_CODIGO_IDT5		= "-5";
	public static final String	OBTENERDATOSVENTA_MENSAJE_IDT5		= "Error de timeout en el WS Localizaciones";

	// -----------------
	public static final String	IDTRANSACCION						= "idTransaccion";
	public static final String	MSGID								= "msgid";
	public static final String	USRID								= "userId";
	public static final String	TIMESTAMP							= "timestamp";
	public static final String	ACCEPT								= "accept";
	public static final String	API									= "api";
	public static final String	CORCHETE							= "]";
	// -----------------
	public static final String	CONFIGPROPERTIES					= "config.properties";
	public static final String	SWAGGERJAXRSCONFIG					= "SwaggerJaxrsConfig";
	public static final String	URLSWAGGERJAXRSCONFIG				= "/SwaggerJaxrsConfig";
	public static final String	HTML5CORSFILTER						= "HTML5CorsFilter";
	public static final String	URLPATTERNS							= "/api/*";
	public static final String	ACCESSCONTROLALLOWORIGIN			= "Access-Control-Allow-Origin";
	public static final String	ACCESSCONTROLALLOWMETHODS			= "Access-Control-Allow-Methods";
	public static final String	ACCESSCONTROLALLOWHEADERS			= "Access-Control-Allow-Headers";
	public static final String	ASTERISCO							= "*";
	public static final String	METODOSPERMITIDOS					= "GET, POST, DELETE, PUT";
	public static final String	CONTENTTYPE							= "Content-Type";
	// -----------------
	public static final String	SOMVT_VENTA							= "SOMVT_VENTA";
	public static final String	VENTN_ID_VENTA						= "VENTN_ID_VENTA";
	public static final String	CLIEN_ID							= "CLIEN_ID";
	public static final String	TIPVN_ID_VENTA						= "TIPVN_ID_VENTA";
	public static final String	TIPON_ID_OPERACION					= "TIPON_ID_OPERACION";
	public static final String	VENTV_COFIC_VENTA					= "VENTV_COFIC_VENTA";
	public static final String	VENTV_OFIC_VENTA					= "VENTV_OFIC_VENTA";
	public static final String	VENTV_COD_CANAL						= "VENTV_COD_CANAL";
	public static final String	VENTV_CANAL							= "VENTV_CANAL";
	public static final String	VENTN_PRECIO						= "VENTN_PRECIO";
	public static final String	VENTN_DESCUENTO						= "VENTN_DESCUENTO";
	public static final String	VENTN_SUBTOTAL						= "VENTN_SUBTOTAL";
	public static final String	IGVN_ID								= "IGVN_ID";
	public static final String	VENTN_IMPUESTO						= "VENTN_IMPUESTO";
	public static final String	VENTN_TOTAL							= "VENTN_TOTAL";
	public static final String	VENTV_COD_VENDEDOR					= "VENTV_COD_VENDEDOR";
	public static final String	VENTV_OBSERVACION					= "VENTV_OBSERVACION";
	public static final String	VENTC_ESTADO						= "VENTC_ESTADO";
	public static final String	VENTV_USUARIOCREA					= "VENTV_USUARIOCREA";
	public static final String	VENTD_FECHACREA						= "VENTD_FECHACREA";
	public static final String	VENTV_USUARIOMODI					= "VENTV_USUARIOMODI";
	public static final String	VENTD_FECHAMODI						= "VENTD_FECHAMODI";
	public static final String	SOCIN_ID							= "SOCIN_ID";
	public static final String	VENTC_BLOQUEO						= "VENTC_BLOQUEO";

	// -----------------
	public static final String	SOMVT_VENTA_DETALLE					= "SOMVT_VENTA_DETALLE";
	public static final String	VENDN_ID_DETALLE					= "VENDN_ID_DETALLE";
	public static final String	PLANV_ID							= "PLANV_ID";
	public static final String	LPREN_ID							= "LPREN_ID";
	public static final String	VENTV_COD_MATERIAL					= "VENTV_COD_MATERIAL";
	public static final String	VENTV_DESC_MATERIAL					= "VENTV_DESC_MATERIAL";
	public static final String	VENTV_TIPO_ITEM						= "VENTV_TIPO_ITEM";
	public static final String	VENTC_FLAG_PACK						= "VENTC_FLAG_PACK";
	public static final String	VENDV_LINEA							= "VENDV_LINEA";
	public static final String	VENTV_SERIE							= "VENTV_SERIE";
	public static final String	VENDN_PRECIO						= "VENDN_PRECIO";
	public static final String	VENDC_ESTADO						= "VENDC_ESTADO";
	public static final String	VENDV_OBSERVACION					= "VENDV_OBSERVACION";
	public static final String	VENDV_USUARIOCREA					= "VENDV_USUARIOCREA";
	public static final String	VENDD_FECHACREA						= "VENDD_FECHACREA";
	public static final String	VENDV_USUARIOMODI					= "VENDV_USUARIOMODI";
	public static final String	VENDD_FECHAMODI						= "VENDD_FECHAMODI";

	// -----------------
	public static final String	SOMVT_VENTA_SAP						= "SOMVT_VENTA_SAP";
	public static final String	VENSV_NUM_PSAP						= "VENSV_NUM_PSAP";
	public static final String	VENSV_USUARIOCREA					= "VENSV_USUARIOCREA";
	public static final String	VENSD_FECHACREA						= "VENSD_FECHACREA";
	public static final String	VENSV_USUARIOMODI					= "VENSV_USUARIOMODI";
	public static final String	VENSD_FECHAMODI						= "VENSD_FECHAMODI";

	// -----------------
	public static final String	SOMVT_COBERTURA						= "SOMVT_COBERTURA";
	public static final String	COBEN_ID							= "COBEN_ID";
	public static final String	DEPAN_ID							= "DEPAN_ID";
	public static final String	PROVN_ID							= "PROVN_ID";
	public static final String	DISTN_ID							= "DISTN_ID";
	public static final String	CEPON_ID_POBLADO					= "CEPON_ID_POBLADO";
	public static final String	COBEV_DIRECCION						= "COBEV_DIRECCION";
	public static final String	COBEV_DESC							= "COBEV_DESC";
	public static final String	COBEC_FLAG							= "COBEC_FLAG";
	public static final String	COBEC_ESTADO						= "COBEC_ESTADO";
	public static final String	COBEV_USUARIOCREA					= "COBEV_USUARIOCREA";
	public static final String	COBED_FECHACREA						= "COBED_FECHACREA";
	public static final String	COBEV_USUARIOMODI					= "COBEV_USUARIOMODI";
	public static final String	COBED_FECHAMODI						= "COBED_FECHAMODI";
	public static final String	COBEV_TELEFONO						= "COBEV_TELEFONO";
	public static final String	COBEV_CELULAR						= "COBEV_CELULAR";
	public static final String	COBEV_EMAIL							= "COBEV_EMAIL";
	public static final String	COBEC_FLAG_BLOQUEO					= "COBEC_FLAG_BLOQUEO";

	// -----------------
	public static final String	SOMVT_ACTIVACION					= "SOMVT_ACTIVACION";
	public static final String	ACTIN_ID							= "ACTIN_ID";
	public static final String	ACTIV_COD_RECARGA					= "ACTIV_COD_RECARGA";
	public static final String	ACTIV_LINEA							= "ACTIV_LINEA";
	public static final String	ACTIV_ID_SUSCRIPCION				= "ACTIV_ID_SUSCRIPCION";
	public static final String	ACTIC_ESTADO						= "ACTIC_ESTADO";
	public static final String	ACTIC_ESTADOWS						= "ACTIC_ESTADOWS";
	public static final String	ACTIV_MENS_WS						= "ACTIV_MENS_WS";
	public static final String	ACTIV_USUARIOCREA					= "ACTIV_USUARIOCREA";
	public static final String	ACTID_FECHACREA						= "ACTID_FECHACREA";
	public static final String	ACTIV_USUARIOMODI					= "ACTIV_USUARIOMODI";
	public static final String	ACTID_FECHAMODI						= "ACTID_FECHAMODI";
	// -----------------
	public static final String	SOMVT_VENTA_SEQ						= "SOMVT_VENTA_SEQ";
	public static final String	SOMVTSEQ_VENTA						= "SOMVTSEQ_VENTA";
	public static final String	SOMVT_VENTA_DETALLE_SEQ				= "SOMVT_VENTA_DETALLE_SEQ";
	public static final String	SOMVTSEQ_VENTA_DETALLE				= "SOMVTSEQ_VENTA_DETALLE";
	public static final String	SOMVT_ACTIVACION_SEQ				= "SOMVT_ACTIVACION_SEQ";
	public static final String	SOMVTSEQ_ACTIVACION					= "SOMVTSEQ_ACTIVACION";
	public static final String	SOMVT_COBERTURA_SEQ					= "SOMVT_COBERTURA_SEQ";
	public static final String	SOMVTSEQ_COBERTURA					= "SOMVTSEQ_COBERTURA";

	// -----------------
	public static final String	PERSISTENCEPACKAGEUNIT				= "pe.com.claro.vent.ventas";
	public static final String	LINEA								= "linea";
	public static final String	QUERYDETALLEVENTABASE				= "SELECT p FROM DetalleVenta p";
	public static final String	QUERYDETALLEVENTAADICIONAL1			= " WHERE p.idDetalle = (SELECT MAX(s.idDetalle) from DetalleVenta s WHERE s.linea = :linea)";

	// -----------------
	public static final String	NUMEROPEDIDO						= "numeroPedido";
	public static final String	QUERYVENTAPEDIDOBASE				= "SELECT p FROM VentaPedido p";
	public static final String	QUERYVENTAPEDIDOADICIONAL1			= " WHERE p.numeroPedido = :numeroPedido)";
	// ------------------
	public static final String	IDVENTA								= "idVenta";
	public static final String	QUERYVENTABASE						= "SELECT p FROM Venta p";
	public static final String	QUERYVENTAADICIONAL1				= " WHERE p.idVenta = :idVenta)";
	// -----------------
	public static final String	PROPERTIESINTERNOS					= "config.properties";
	public static final String	PROPERTIESEXTERNOS					= ".properties";
	public static final String	PROPERTIESKEY						= "claro.properties";
	public static final String	CONSTANTENOJNDI						= "javax.persistence.PersistenceException";
	public static final String	CONSTANTENOJNDIWS					= "MessageBodyProviderNotFoundException";
	public static final String	CONSTANTETIMEOUTWS					= "java.net.SocketTimeoutException";
	public static final String	UNO									= "1";
	public static final String	DOS									= "2";
	public static final String	ZERO								= "0";
	public static final String	TEXTO_VACIO							= "";
	public static final String	DEFAULTENCONDIGPROPERTIES			= null;
	public static final String	DEFAULTENCONDINGAPI					= null;
	public static final String	FORMATO_FECHA_SP					= null;
	public static final Object	NULO								= null;
}
