package behavioral.interpreter;

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
