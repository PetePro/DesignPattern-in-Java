package behavioral.interpreter;

/**
 * 
 * 解释器模式 Interpreter Pattern
 * 给定一个语言，定义它的文法的一种表示，并定义一个解释器，这个解释器使用该表示来解释语言中的句子。
 * @author 彼得大帝
 *
 */

public class Client {

	public static void main(String[] args) {
		//(3-1)+(5-3)
		Context context=new Context();
		Expression a=new TerminalExpression(3);
		Expression b=new TerminalExpression(1);
		Expression c=new TerminalExpression(5);
		Expression expr=new AddExpression(new SubExpression(a, b), new SubExpression(c, a));
		System.out.println(expr.interpret(context));
	}

}
