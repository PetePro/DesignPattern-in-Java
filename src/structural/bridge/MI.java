package structural.bridge;

public class MI extends Phone {

	private String name;

	protected MI(String name, AppImplementor app) {
		super(app);
		this.name = name;
	}

	public void run() {
		System.out.print("MI " + name + " ");
		app.run();
	}

}
