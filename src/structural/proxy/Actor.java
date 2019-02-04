package structural.proxy;

/*
 * RealSubject 真实主题
 * 真实实体，具体实现。
 */

public class Actor implements IAction {
	private String name;

	public Actor(String name) {
		this.name = name;
	}

	@Override
	public void jump() {
		System.out.println(name + "is jumping");
	}

	@Override
	public void driver() {
		System.out.println(name + "is driving");
	}

	@Override
	public void fight() {
		System.out.println(name + "is fighting");
	}

}
