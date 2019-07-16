
package pe.com.claro.common.resource.exception;

import javax.ws.rs.core.Response;

public class ApiException extends RuntimeException{
  /**
	 * 
	 */
private static final long serialVersionUID = -4463545099205456203L;

	private int codigoRespuesta;
	private Integer status;


	ApiException(int codigoRespuesta, String mensajeError) {
		super(mensajeError);
		this.codigoRespuesta = codigoRespuesta;
	}


	ApiException(int status, int codigoRespuesta, String mensajeError) {
		super(mensajeError);
		this.codigoRespuesta = codigoRespuesta;
		this.status = status;

	}


	ApiException(int codigoRespuesta, String msg, String mensajeError) {
		super(mensajeError);
		this.codigoRespuesta = codigoRespuesta;

	}

	public int getCodigoRespueta() {
		return codigoRespuesta;
	}

	public void setCodigoRespueta(int codigoRespueta) {
		this.codigoRespuesta = codigoRespueta;
	}

	public Integer getStatus() {

		if(this.status==null)
			this.status= Response.Status.BAD_REQUEST.getStatusCode();
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

}
