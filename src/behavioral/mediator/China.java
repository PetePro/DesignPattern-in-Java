package behavioral.mediator;

public class China extends Country {

	public China(UnitedNations mediator) {
		super(mediator);
	}

	public void declare(String message) {
		mediator.declare(message, this);
	}

	public void getMessage(String message) {
		System.out.println("中国获知：" + message);
	}

}
