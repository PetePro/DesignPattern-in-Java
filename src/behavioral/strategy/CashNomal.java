package behavioral.strategy;

public class CashNomal implements Cash {

	@Override
	public double cashCalculate(double money) {
		return money;
	}

}
