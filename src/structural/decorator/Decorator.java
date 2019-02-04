package structural.decorator;

/*
 * Decorator 装饰抽象类
 * 继承了Component，从外类来拓展Component，对于Component来说，无需知道Decorator的存在。
 */

public abstract class Decorator implements Coffee {
	private String description = "我只是装饰器，不知道具体的描述";

	@Override
	public String getDescription() {
		return description;
	}

	@Override
	public double getPrice() {
		return 0;
	}
}
