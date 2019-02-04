package creational.factorymethod;

/*
 * Factory 工厂
 * 声明工厂方法，返回一个Product类型的对象。
 * 具体工厂继承于此，重定义工厂方法返回ConcreteProduct的实例。
 */

public interface IFactory {
	public Operation createOperation();
}
