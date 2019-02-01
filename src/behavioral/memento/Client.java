package behavioral.memento;

public class Client {

	public static void main(String[] args) {
		// ���һ��
		GameOriginator state = new GameOriginator();
		state.initState();
		state.stateDisplay();
		// ��һ�ᱣ��
		state.setState(25);
		GameCaretaker stateAdmin = new GameCaretaker();
		stateAdmin.setMemento(state.saveState());
		// ��һ���������
		state.setState(65);
		state.stateDisplay();
		// ������ڶ���
		state.recoveryState(stateAdmin.getMemento());
		state.stateDisplay();
	}

}
