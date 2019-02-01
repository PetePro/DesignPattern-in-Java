package structural.flyweight;

public class PortalWebsite implements Website {

	private String name;

	public PortalWebsite(String name) {
		this.name = name;
	}

	@Override
	public void user(String username) {
		System.out.println(this.getClass().getName() + ": " + name + ", user: " + username);
	}

}
