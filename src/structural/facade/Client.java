package structural.facade;

/**
 * 
 * ���ģʽ Facade
 * Ϊ��ϵͳ�ṩһ�µĽ��棬��ģʽ������һ���߲�ӿڣ�����ӿ�ʹ����һ��ϵͳ����ʹ�á�
 * @author �˵ô��
 *
 */

public class Client {

	public static void main(String[] args) {
		Facade facade = new Facade();
		facade.drawCircle();
		facade.drawSquare();
	}

}
