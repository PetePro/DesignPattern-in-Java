package behavioral.memento;

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
