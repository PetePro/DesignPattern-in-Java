package structural.decorator;

public class CoffeeBeanA implements Coffee {
	private String description = "选了第一种咖啡豆";

	@Override
	public String getDescription() {
		return description;
	}

	@Override
	public double getPrice() {
		return 50;
	}
}
