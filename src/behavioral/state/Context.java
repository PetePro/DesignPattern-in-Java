package behavioral.state;

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
