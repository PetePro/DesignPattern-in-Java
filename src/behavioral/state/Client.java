package behavioral.state;

/**
 * 
 * ״̬ģʽ State Pattern
 * ��һ�����������״̬�ı�ʱ����ı�����Ϊ���������������ı������ࡣ
 * @author �˵ô��
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
