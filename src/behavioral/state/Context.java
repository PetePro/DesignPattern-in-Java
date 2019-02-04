package behavioral.state;

/*
 * Context 上下文
 * 维护一个Concrete State子类的实例。
 */

public class Context {
	private TCPState state;

	public Context() {
		state = null;
	}

	public void setState(TCPState state) {
		this.state = state;
	}

	public TCPState getState() {
		return state;
	}
}
