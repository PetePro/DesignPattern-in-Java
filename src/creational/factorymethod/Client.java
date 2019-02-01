package creational.factorymethod;

public class Client {

	public static void main(String[] args) {
		IFactory operFactory = new AddFactory();
		Operation oper = operFactory.createOperation();
		oper.set_numberA(6);
		oper.set_numberB(3);
		System.out.println(oper.getResult());
	}

}
