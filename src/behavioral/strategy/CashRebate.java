package behavioral.strategy;

public class CashRebate implements Cash {

	private double rebate;

	public CashRebate(double rebate) {
		this.rebate = rebate;
	}

	@Override
	public double cashCalculate(double money) {
		return money * this.rebate;
	}

}
