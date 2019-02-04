package behavioral.memento;

/*
 * Originator 发起人
 * 创建Menmeto，记录和恢复状态。
 */

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
		System.out.println("游戏当前状态：" + state + "%");
	}

	public GameMemento saveState() {
		return new GameMemento(this.state);
	}

	public void recoveryState(GameMemento memento) {
		this.state = memento.getState();
	}

}
