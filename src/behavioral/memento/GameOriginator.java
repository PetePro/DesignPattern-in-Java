package behavioral.memento;

public class GameOriginator {
	private int state;

	public void initState() {
		this.state = 0;
	}

	public int getState() {
		return state;
	}

	public void setState(int state) {
		this.state = state;
	}

	public void stateDisplay() {
		System.out.println("ÓÎÏ·µ±Ç°×´Ì¬£º" + state + "%");
	}

	public GameMemento saveState() {
		return new GameMemento(this.state);
	}

	public void recoveryState(GameMemento memento) {
		this.state = memento.getState();
	}

}
