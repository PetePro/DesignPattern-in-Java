package behavioral.strategy;

/*
 * Context 上下文
 * 用一个具体策略来配置，维护一个对Strategy对象的引用。
 * 初始化时传入具体策略对象，然后根据具体策略，调用其算法的方法。
 */

public class Context {
	private Cash c;

	public Context(Cash c) {
		this.c = c;
	}

	public double getCashMethod(double money) {
		return c.cashCalculate(money);
	}
}
