package creational.factorymethod;

public class OperationMul extends Operation {
	public double getResult() {
		double result = 0;
		result = super.get_numberA() * super.get_numberB();
		return result;
	}
}
