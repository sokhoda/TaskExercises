package interpreter;

public class TerminalExpression implements Expression {
	private String data;

	public TerminalExpression(String data) {
		this.data = data;
	}

	@Override
	public boolean interpret(String context) {
		boolean res = false;
		if (context.contains(data)) {
			res = true;
		}
		return res;
	}

}
