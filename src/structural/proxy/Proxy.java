package structural.proxy;

/*
 * Proxy ����
 * ����һ������ʹ�ô�����Է���ʵ�壬���ṩһ����Subject�Ľӿ���ͬ�Ľӿڣ������滻����ʵ�塣
 */

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
