package structural.decorator;

/*
 * Component 抽象构件
 * 定义一个对象接口，可以给这些对象动态添加指责。
 * 具体对象继承于此。
 */

public interface Coffee {
	public String getDescription();

	public double getPrice();
}
