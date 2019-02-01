package creational.simplefactory;

public class OperationDiv extends Operation {
	public double getResult() {
		double result = 0;
		result = _numberA / _numberB;
		return result;
	}
}
