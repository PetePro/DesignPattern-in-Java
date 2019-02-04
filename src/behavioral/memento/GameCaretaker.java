package behavioral.memento;

/*
 * Caretaker 管理者
 * 保存好Menmeto。
 */

public class GameCaretaker {
	private GameMemento memento;

	public GameMemento getMemento() {
		return memento;
	}

	public void setMemento(GameMemento memento) {
		this.memento = memento;
	}

}
