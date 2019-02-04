package behavioral.interpreter;

/*
 * Abstract Expression 抽象表达式
 */

public interface Expression {
	public int interpret(Context context);
}
