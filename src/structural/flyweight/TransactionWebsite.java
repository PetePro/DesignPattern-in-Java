package structural.flyweight;

public class TransactionWebsite implements Website {
	
	private String name;

	public TransactionWebsite(String name) {
		this.name = name;
	}

	@Override
	public void user(String username) {
		System.out.println(this.getClass().getName() + ": " + name + ", user: " + username);
	}

}
