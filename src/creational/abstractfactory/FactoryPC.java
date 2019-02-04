package creational.abstractfactory;

/*
 * Abstract Factory ���󹤳���
 * �������в�Ʒ�����ĳ��󷽷������幤���̳��ڴˣ���ʹ�þ����Ʒ��
 */

public interface FactoryPC {
	ProductMouse createMouse();

	ProductMonitor createMonitor();

	ProductKeyboard createKeyboard();
}
