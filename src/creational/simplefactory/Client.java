package creational.simplefactory;

public class Client {

	public static void main(String[] args) {
		OperationFactory of = new OperationFactory();
		Operation oper = of.createOperation("/");
		oper.set_numberA(6);
		oper.set_numberB(3);
		double result = oper.getResult();
		System.out.println(result);
	}

}
