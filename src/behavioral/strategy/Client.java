package behavioral.strategy;

/**
 * 
 * ����ģʽ Strategy Pattern
 * ���������㷨���壬�ֱ��װ������������֮����Ի����滻�����㷨�ı仯����Ӱ�쵽ʹ���㷨���û���
 * @author �˵ô��
 *
 */

public class Client {

	public static void main(String[] args) {
		Context con=new Context(new CashReturn(300, 100));
		System.out.println(con.getCashMethod(400));
	}

}
