package structural.decorator;

public class CoffeeBeanB implements Coffee {
	private String description = "�ڶ��ֿ��ȶ���";

	@Override
	public String getDescription() {
		return description;
	}

	@Override
	public double getPrice() {
		return 100;
	}
}
