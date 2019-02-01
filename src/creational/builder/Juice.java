package creational.builder;

public class Juice extends Drink {

	@Override
	public String name() {
		return "juice";
	}

	@Override
	public float price() {
		return 9f;
	}
	
}
