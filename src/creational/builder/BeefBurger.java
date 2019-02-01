package creational.builder;

public class BeefBurger extends Burger {

	@Override
	public String name() {
		return "beefburger";
	}

	@Override
	public float price() {
		return 15f;
	}

}
