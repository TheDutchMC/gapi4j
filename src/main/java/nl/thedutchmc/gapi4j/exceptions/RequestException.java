package nl.thedutchmc.gapi4j.exceptions;

public class RequestException extends RuntimeException {
	
	private static final long serialVersionUID = 1L;

	public RequestException(String errorMessage) {
		super(errorMessage);
	}
	
}
