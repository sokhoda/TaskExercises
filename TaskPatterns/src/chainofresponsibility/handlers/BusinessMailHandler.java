package chainofresponsibility.handlers;

import chainofresponsibility.Email;

public class BusinessMailHandler implements EMailHandler {

	private EMailHandler next;

	@Override
	public void setNext(EMailHandler handler) {
		next = handler;
	}

	@Override
	public void handleRequest(Email email) {
		if (!email.getFrom().endsWith("@businessaddress.com")) {
			next.handleRequest(email);
		} else {
			// handle request (move to correct folder)}}}
			System.out.println("Business HANDLER PROCESSED!");
		}
	}

}
