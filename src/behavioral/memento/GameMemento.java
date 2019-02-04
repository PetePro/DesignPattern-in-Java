package behavioral.memento;

/*
 * Memento 备忘录
 * 存储Originator对象的内部状态。
 */

public class GameMemento {
	private int state;

	public GameMemento(int state) {
		this.state = state;
	}

	public int getState() {
		return state;
	}

	public void setState(int state) {
		this.state = state;
	}

}
