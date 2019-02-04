package behavioral.strategy;

/*
 * Strategy 策略类
 * 定义所有支持算法的公共接口，具体策略继承于它。
 */

public interface Cash {
	public double cashCalculate(double money);
}
