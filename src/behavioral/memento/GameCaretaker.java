package behavioral.memento;

/*
 * Caretaker ������
 * �����Menmeto��
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
