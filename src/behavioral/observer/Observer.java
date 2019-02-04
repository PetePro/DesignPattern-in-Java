package behavioral.observer;

/*
 * Observer 观察者
 * 为所有具体观察者定义一个接口，在得到Subject的通知时更新自己。
 */

public abstract class Observer {

	protected Subject subject;

	public abstract void update(String name, int state);
}
