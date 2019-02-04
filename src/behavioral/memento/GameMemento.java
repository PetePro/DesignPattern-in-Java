package behavioral.memento;

/*
 * Memento ����¼
 * �洢Originator������ڲ�״̬��
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
