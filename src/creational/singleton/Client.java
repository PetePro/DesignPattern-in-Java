package creational.singleton;

/**
 * 
 * ����ģʽ Singleton Pattern
 * ��֤һ�������һ��ʵ�������ṩһ����������ȫ�ַ��ʵ㡣
 * @author �˵ô��
 *
 */

public class Client {

	public static void main(String[] args) {
		Singleton instance = Singleton.getInstance();
		instance.showMessage();
	}

}
