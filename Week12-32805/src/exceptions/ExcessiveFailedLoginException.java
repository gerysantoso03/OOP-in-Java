package exceptions;

public class ExcessiveFailedLoginException extends Exception {
	
	public ExcessiveFailedLoginException() {
		super("anda telah mencapai jumlah batas login!!");
	}
	
	public ExcessiveFailedLoginException(String message) {
		super(message);
	}
}
