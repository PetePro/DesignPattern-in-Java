package structural.bridge;

public class Client {

	public static void main(String[] args) {
		Phone mi5c = new MI("5C", new Quark());
		mi5c.run();
		Phone mate10 = new Huawei("mate 10", new Bilibili());
		mate10.run();
		mate10 = new Huawei("mate 10", new Quark());
		mate10.run();
	}

}
