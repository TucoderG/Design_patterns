package exceptions;

public class exception extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	

	public exception() {
    }

    public exception(String message) {
        super(message);
    }

    public exception(String message, Throwable cause) {
        super(message, cause);
    }

    public exception(Throwable cause) {
        super(cause);
    }

    public exception(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }

}
