package structural.proxy;

/**
 * 
 * ����ģʽ Proxy Pattern
 * Ϊ���������ṩһ�ִ����Կ��ƶ��������ķ��ʡ�
 * @author �˵ô��
 *
 */

public class Client {

	public static void main(String[] args) {
		Proxy p = new Proxy("Leonard ");
		p.jump();
		p.driver();
		p.fight();
	}

}
