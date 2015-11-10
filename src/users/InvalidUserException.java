package users;

public class InvalidUserException extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = 592551134914120923L;

	public InvalidUserException() {
		super();
	}

	public InvalidUserException(String message, Throwable cause,
			boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public InvalidUserException(String message, Throwable cause) {
		super(message, cause);
	}

	public InvalidUserException(String message) {
		super(message);
	}

	public InvalidUserException(Throwable cause) {
		super(cause);
	}

}
