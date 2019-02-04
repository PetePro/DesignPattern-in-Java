package creational.factorymethod;

/**
 * 
 * ��������ģʽ Factory Method Pattern
 * ����һ�����ڴ�������Ľӿڣ����������ʵ�����ĸ��ࡣ��򵥹���ģʽ��ȣ���ģʽʹ��һ�����ʵ�����ӳٵ������ࡣ
 * @author �˵ô��
 *
 */

public class Client {

	public static void main(String[] args) {
		IFactory operFactory = new AddFactory();
		Operation oper = operFactory.createOperation();
		oper.set_numberA(6);
		oper.set_numberB(3);
		System.out.println(oper.getResult());
	}

}
