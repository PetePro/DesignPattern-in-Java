package behavioral.strategy;

public class Context {
	private Cash c;

	public Context(Cash c) {
		this.c = c;
	}

	public double getCashMethod(double money) {
		return c.cashCalculate(money);
	}
}
