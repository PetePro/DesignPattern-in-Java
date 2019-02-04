package behavioral.strategy;

/*
 * Context ������
 * ��һ��������������ã�ά��һ����Strategy��������á�
 * ��ʼ��ʱ���������Զ���Ȼ����ݾ�����ԣ��������㷨�ķ�����
 */

public class Context {
	private Cash c;

	public Context(Cash c) {
		this.c = c;
	}

	public double getCashMethod(double money) {
		return c.cashCalculate(money);
	}
}
