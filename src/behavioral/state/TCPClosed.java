package behavioral.state;

public class TCPClosed implements TCPState {

	@Override
	public void stateDescription(Context context) {
		System.out.println("TCP is closed");
		context.setState(this);
	}

}
