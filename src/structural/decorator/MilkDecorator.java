package structural.decorator;

public class MilkDecorator extends Decorator {
	private String description = "º”¡À≈£ƒÃ£°";
	private Coffee coffee = null;

	public MilkDecorator(Coffee coffee){
		this.coffee = coffee;
	}

	public String getDescription() {
		return coffee.getDescription() + "\n" + description;
	}

	public double getPrice() {
		return coffee.getPrice() + 20;
	}
}
