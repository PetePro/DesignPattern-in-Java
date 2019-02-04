package creational.abstractfactory;

/**
 * 
 * 抽象工厂模式 Abstract Factory Pattern
 * 提供一个创建一系列相关或相互依赖对象的接口，而无需指定它们具体的类。
 * @author 彼得大帝
 *
 */

public class Client {

	public static void main(String[] args) {
		FactoryPC hp = new FactoryHp();
		ProductMouse hpmouse = hp.createMouse();
		hpmouse.getDescription();
		ProductMonitor hpmonitor = hp.createMonitor();
		hpmonitor.getDescription();
		ProductKeyboard hpkeyboard = hp.createKeyboard();
		hpkeyboard.getDescription();

		FactoryPC dell = new FactoryDell();
		ProductMouse dellmouse = dell.createMouse();
		dellmouse.getDescription();
		ProductMonitor dellmonitor = dell.createMonitor();
		dellmonitor.getDescription();
		ProductKeyboard dellkeyboard = dell.createKeyboard();
		dellkeyboard.getDescription();
	}

}
