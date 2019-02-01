package creational.prototype;

public class Oreo extends Dessert {
	public Oreo() {
		type = "Oreo";
	}

	@Override
	void makeDessert() {
		System.out.println("making oreo");
	}

}
