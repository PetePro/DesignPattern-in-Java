package structural.decorator;

public class SugarDecorator extends Decorator {
	private String description = "º”¡ÀÃ«£°";
	private Coffee coffee = null;

	public SugarDecorator(Coffee coffee){
		this.coffee = coffee;
	}

	public String getDescription() {
		return coffee.getDescription() + "\n" + description;
	}

	public double getPrice() {
		return coffee.getPrice() + 15;
	}
}
