package creational.simplefactory;

/**
 * 
 * 简单工厂模式 Simple Factory Pattern
 * 简单工厂模式专门定义一个类来负责创建其他类的实例，被创建的实例通常都具有共同的父类。
 * @author 彼得大帝
 *
 */

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
