package behavioral.chainofresponsibility;

import behavioral.chainofresponsibility.handlers.BusinessMailHandler;
import behavioral.chainofresponsibility.handlers.EMailHandler;
import behavioral.chainofresponsibility.handlers.GMailHandler;

//email client
public class EMailClient {
	private EMailProcessor processor;

	public EMailClient() {
		createProcessor();
	}

	private void createProcessor() {
		processor = new EMailProcessor();
		processor.addHandler(new BusinessMailHandler());
		processor.addHandler(new GMailHandler());
	}

	public void addRule(EMailHandler handler) {
		processor.addHandler(handler);
	}

	public void emailReceived(Email email) {
		processor.handleRequest(email);
	}

	public static void main(String[] args) {
		EMailClient client = new EMailClient();

		Email email = new Email("@businessaddress.com");
		// Email email = new Email("@gmail.com");
		client.emailReceived(email);
	}
}
