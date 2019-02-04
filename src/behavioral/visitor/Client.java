package behavioral.visitor;

/**
 * 
 * 访问者模式 Visitor Pattern
 * 表示一个作用于某对象结构中的各元素的操作。
 * 它使你可以在不改变各元素类的前提下定义作用于这些元素的新操作。
 * @author 彼得大帝
 *
 */

public class Client {

	public static void main(String[] args) {
		Computer a1 = new Computer();
		a1.attach(new Mouse());
		a1.attach(new Keyboard());
		a1.attach(new Monitor());
		ComputerUser user = new ComputerUser();
		a1.display(user);
		ComputerAdministrator admin = new ComputerAdministrator();
		a1.display(admin);
	}

}
