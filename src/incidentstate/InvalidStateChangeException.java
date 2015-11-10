package incidentstate;

public class InvalidStateChangeException extends Exception{

	public InvalidStateChangeException() {
		super();
	}

	public InvalidStateChangeException(String message, Throwable cause,
			boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public InvalidStateChangeException(String message, Throwable cause) {
		super(message, cause);
	}

	public InvalidStateChangeException(String message) {
		super(message);
	}

	public InvalidStateChangeException(Throwable cause) {
		super(cause);
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 8247840501205643490L;

}
