package behavioral.interpreter;

public class AddExpression implements Expression {

	private Expression expr1 = null;
	private Expression expr2 = null;

	public AddExpression(Expression expr1, Expression expr2) {
		this.expr1 = expr1;
		this.expr2 = expr2;
	}

	@Override
	public int interpret(Context context) {
		return expr1.interpret(context) + expr2.interpret(context);
	}

}
