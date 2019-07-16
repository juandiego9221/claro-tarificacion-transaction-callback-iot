
package pe.com.claro.common.resource.exception;

public class WSException extends ComunesExceptionBean {
	/**
	 * 
	 */
	private static final long serialVersionUID = -7482288873992395827L;


	public WSException(int code, String msg) {
		super(code, msg);

	}

	public WSException(int status, int code, String msg, String developerMessage) {
		super(status, code, msg, developerMessage);

	}

	public WSException(int code, String msg, String developerMessage) {
		super(code, msg, developerMessage);

	}

}
