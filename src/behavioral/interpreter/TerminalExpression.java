package behavioral.interpreter;

/*
 * TerminalExpression 终结符表达式
 */

public class TerminalExpression implements Expression {

	private int data;

	public TerminalExpression(int data) {
		this.data = data;
	}

	@Override
	public int interpret(Context context) {
		return this.data;
	}

}
