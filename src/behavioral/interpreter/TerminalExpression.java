package behavioral.interpreter;

/*
 * TerminalExpression �ս������ʽ
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
