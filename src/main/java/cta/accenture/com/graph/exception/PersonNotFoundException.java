package cta.accenture.com.graph.exception;

public class PersonNotFoundException extends RuntimeException {
	
	private static final long serialVersionUID = -2065875173733100147L;

	public PersonNotFoundException(String message) {
		super(message);
	}

}
