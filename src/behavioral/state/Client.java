package behavioral.state;

/**
 * 
 * 状态模式 State Pattern
 * 当一个对象的内在状态改变时允许改变其行为，这个对象看起来像改变了其类。
 * @author 彼得大帝
 *
 */

public class Client {

	public static void main(String[] args) {
		Context context = new Context();
		TCPState state = new TCPListen();
		state.stateDescription(context);
		state = new TCPEstablished();
		state.stateDescription(context);
		state = new TCPClosed();
		state.stateDescription(context);
	}

}
