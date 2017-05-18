package by.htp.sporteq.service;

public class NoSuchUserException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4221727339349979427L;

	public NoSuchUserException() {
		super();

	}

	public NoSuchUserException(String message, Throwable cause) {
		super(message, cause);

	}

	public NoSuchUserException(String message) {
		super(message);

	}

	public NoSuchUserException(Throwable cause) {
		super(cause);

	}

}
