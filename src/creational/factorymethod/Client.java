package creational.factorymethod;

/**
 * 
 * 工厂方法模式 Factory Method Pattern
 * 定义一个用于创建对象的接口，让子类决定实例化哪个类。与简单工厂模式相比，该模式使得一个类的实例化延迟到其子类。
 * @author 彼得大帝
 *
 */

public class Client {

	public static void main(String[] args) {
		IFactory operFactory = new AddFactory();
		Operation oper = operFactory.createOperation();
		oper.set_numberA(6);
		oper.set_numberB(3);
		System.out.println(oper.getResult());
	}

}
