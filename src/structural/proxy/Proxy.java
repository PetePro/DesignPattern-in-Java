package structural.proxy;

public class Proxy implements IAction {
	private Actor a;

	public Proxy(String name) {
		a = new Actor(name);
	}

	@Override
	public void jump() {
		a.jump();
	}

	@Override
	public void driver() {
		a.driver();
	}

	@Override
	public void fight() {
		a.fight();
	}
}
