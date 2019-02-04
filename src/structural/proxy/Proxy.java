package structural.proxy;

/*
 * Proxy 代理
 * 保存一个引用使得代理可以访问实体，并提供一个与Subject的接口相同的接口，用来替换真正实体。
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
