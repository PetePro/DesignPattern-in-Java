package structural.decorator;

public class CoffeeBeanB implements Coffee {
	private String description = "µÚ¶þÖÖ¿§·È¶¹£¡";

	@Override
	public String getDescription() {
		return description;
	}

	@Override
	public double getPrice() {
		return 100;
	}
}
