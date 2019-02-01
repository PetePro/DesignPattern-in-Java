package behavioral.state;

public class TCPEstablished implements TCPState {

	@Override
	public void stateDescription(Context context) {
		System.out.println("TCP is established");
		context.setState(this);
	}

}
