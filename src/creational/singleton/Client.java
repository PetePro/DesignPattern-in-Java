package creational.singleton;

public class Client {

	public static void main(String[] args) {
		Singleton instance = Singleton.getInstance();
		instance.showMessage();
	}

}
