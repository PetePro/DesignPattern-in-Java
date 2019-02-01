package behavioral.state;

public class TCPListen implements TCPState {

	@Override
	public void stateDescription(Context context) {
		System.out.println("TCP is listening");
		context.setState(this);
	}

}
