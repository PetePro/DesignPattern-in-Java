package behavioral.observer;

/*
 * Subject 主题或通知者
 * 把所有对观察者对象的引用保存在一个list里，可以增加或删除观察者对象。
 */

import java.util.ArrayList;
import java.util.List;

public class Subject {
	private List<Observer> observers = new ArrayList<Observer>();
	private int state;
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getState() {
		return state;
	}

	public void setState(int state) {
		this.state = state;
		notifyAllObservers();
	}

	public void attach(Observer observer) {
		observers.add(observer);
	}

	public void detach(Observer observer) {
		observers.remove(observer);
	}

	public void notifyAllObservers() {
		for (Observer observer : observers) {
			observer.update(name, state);
		}
	}
}
