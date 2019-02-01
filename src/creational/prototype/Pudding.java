package creational.prototype;

public class Pudding extends Dessert {
	public Pudding() {
		type = "Pudding";
	}

	@Override
	void makeDessert() {
		System.out.println("making pudding");
	}

}
