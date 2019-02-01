package behavioral.state;

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
