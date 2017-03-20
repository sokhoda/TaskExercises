package chainofresponsibility;

import chainofresponsibility.handlers.EMailHandler;

public class EMailProcessor {
	// maintain a reference to the previous handler so we can add the next one
	private EMailHandler prevHandler;
	private EMailHandler firstHandler;

	public void addHandler(EMailHandler handler) {
		if (prevHandler != null) {
			prevHandler.setNext(handler);
		} else {
			firstHandler = handler;
		}
		prevHandler = handler;
	}

	public void handleRequest(Email email) {
		firstHandler.handleRequest(email);
	}

}
