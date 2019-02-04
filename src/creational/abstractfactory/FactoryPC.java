package creational.abstractfactory;

/*
 * Abstract Factory 抽象工厂类
 * 包含所有产品创建的抽象方法。具体工厂继承于此，会使用具体产品。
 */

public interface FactoryPC {
	ProductMouse createMouse();

	ProductMonitor createMonitor();

	ProductKeyboard createKeyboard();
}
