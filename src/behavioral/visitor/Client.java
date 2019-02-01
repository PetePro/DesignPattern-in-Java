package behavioral.visitor;

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
