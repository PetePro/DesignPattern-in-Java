package behavioral.observer;

/**
 * 
 * �۲���ģʽ Observer Pattern
 * ����һ��һ�Զ��������ϵ���ö���۲��߶���ͬʱ����ĳһ�������
 * �����������ڷ����仯ʱ����֪ͨ���й۲��߶���ʹ�����Զ������Լ���
 * @author �˵ô��
 *
 */

public class Client {

	public static void main(String[] args) {
		BinaryObserver bo=new BinaryObserver();
		OctalObserver oo=new OctalObserver();
		HexObserver ho=new HexObserver();
		
		Subject subject1=new ConsoleSubject("acer");
		subject1.attach(bo);
		subject1.attach(oo);
		subject1.attach(ho);
		subject1.setState(0);
		
		Subject subject2=new ConsoleSubject("hp");
		subject2.attach(bo);
		subject2.attach(ho);
		subject2.detach(ho);
		subject2.setState(1);
	}

}
