package behavioral.memento;

/**
 * 
 * 备忘录模式 Menmeto Pattern
 * 在不破坏封装性的前提下，捕获一个对象的内部状态并保存，这样以后可恢复至该状态。
 * @author 彼得大帝
 *
 */

public class Client {

	public static void main(String[] args) {
		// 玩第一遍
		GameOriginator state = new GameOriginator();
		state.initState();
		state.stateDisplay();
		// 玩一会保存
		state.setState(25);
		GameCaretaker stateAdmin = new GameCaretaker();
		stateAdmin.setMemento(state.saveState());
		// 玩一半出问题了
		state.setState(65);
		state.stateDisplay();
		// 读档玩第二遍
		state.recoveryState(stateAdmin.getMemento());
		state.stateDisplay();
	}

}
