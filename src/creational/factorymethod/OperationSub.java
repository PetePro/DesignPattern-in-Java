package creational.factorymethod;

public class OperationSub extends Operation {
	public double getResult() {
		double result = 0;
		result = super.get_numberA() - super.get_numberB();
		return result;
	}
}
