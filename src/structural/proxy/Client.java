package structural.proxy;

public class Client {

	public static void main(String[] args) {
		Proxy p = new Proxy("Leonard ");
		p.jump();
		p.driver();
		p.fight();
	}

}
