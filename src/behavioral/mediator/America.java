package behavioral.mediator;

public class America extends Country {

	public America(UnitedNations mediator) {
		super(mediator);
	}

	public void declare(String message) {
		mediator.declare(message, this);
	}

	public void getMessage(String message) {
		System.out.println("美国获知：" + message);
	}

}
