package interpreter;

public class InterpreterRunner {
	public static Expression getMales() {
		return new OrExpression(new TerminalExpression("Vasya"),
				new TerminalExpression("Victor"));
	}

	public static Expression isMarriedWoman() {
		return new AndExpression(new TerminalExpression("Jennifer"),
				new TerminalExpression("married"));
	}

	public static void main(String[] args) {
		Expression isMarried = isMarriedWoman();
		Expression isMale = getMales();

		System.out.println("Jennifer is married:"
				+ isMarried.interpret("Jennifer married"));
		System.out.println("Vasya is male:" + isMale.interpret("Vasya"));
	}
}
