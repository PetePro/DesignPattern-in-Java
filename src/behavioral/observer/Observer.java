package behavioral.observer;

public abstract class Observer {

	protected Subject subject;

	public abstract void update(String name, int state);
}
