package chainofresponsibility.handlers;

import chainofresponsibility.Email;

public interface EMailHandler {
	// reference to the next handler in the chain
	public void setNext(EMailHandler handler);

	// handle request
	public void handleRequest(Email email);
}
