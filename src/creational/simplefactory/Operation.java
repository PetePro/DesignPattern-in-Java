package creational.simplefactory;

/*
 * Product：抽象产品角色
 * 抽象产品角色是所创建的所有对象的父类，负责描述所有实例所共有的公共接口
 */

public abstract class Operation {
	protected double _numberA = 0;
	protected double _numberB = 0;

	public double get_numberA() {
		return _numberA;
	}

	public void set_numberA(double _numberA) {
		this._numberA = _numberA;
	}

	public double get_numberB() {
		return _numberB;
	}

	public void set_numberB(double _numberB) {
		this._numberB = _numberB;
	}

	public abstract double getResult();
}
