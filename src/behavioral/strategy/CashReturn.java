package behavioral.strategy;

public class CashReturn implements Cash {
	private double moneyCondition;
	private double moneyReturn;

	public CashReturn(double moneyCondition, double moneyReturn) {
		this.moneyCondition = moneyCondition;
		this.moneyReturn = moneyReturn;
	}

	@Override
	public double cashCalculate(double money) {
		double result = money;
		if (money >= moneyCondition) {
			result = money - Math.floor(money / moneyCondition) * moneyReturn;
		}
		return result;
	}

}
