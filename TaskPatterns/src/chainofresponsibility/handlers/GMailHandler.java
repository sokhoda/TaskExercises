package chainofresponsibility.handlers;

import chainofresponsibility.Email;

public class GMailHandler implements EMailHandler {
	private EMailHandler next;

	@Override
	public void setNext(EMailHandler handler) {
		next = handler;
	}

	@Override
	public void handleRequest(Email email) {
		if (!email.getFrom().endsWith("@gmail.com")) {
			next.handleRequest(email);
		} else {
			// handle request (move to correct folder)}}}
			System.out.println("GMAIL HANDLER PROCESSED!");
		}
	}
}
