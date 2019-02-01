package creational.builder;

public class ChickenBurger extends Burger {

	@Override
	public String name() {
		return "chickenburger";
	}

	@Override
	public float price() {
		return 12f;
	}

}
