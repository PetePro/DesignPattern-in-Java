package structural.decorator;

public class Decorator implements Coffee {
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
