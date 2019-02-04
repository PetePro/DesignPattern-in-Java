package structural.bridge;

/*
 * Abstract ����
 */

public abstract class Phone {
	protected AppImplementor app;

	protected Phone(AppImplementor app) {
		this.app = app;
	}

	public abstract void run();
}
