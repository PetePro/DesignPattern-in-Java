package structural.decorator;

public class CoffeeBeanA implements Coffee {
	private String description = "ѡ�˵�һ�ֿ��ȶ�";

	@Override
	public String getDescription() {
		return description;
	}

	@Override
	public double getPrice() {
		return 50;
	}
}
