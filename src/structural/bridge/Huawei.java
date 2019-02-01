package structural.bridge;

public class Huawei extends Phone {

	private String name;

	protected Huawei(String name, AppImplementor app) {
		super(app);
		this.name = name;
	}

	public void run() {
		System.out.print("huawei " + name + " ");
		app.run();
	}

}
