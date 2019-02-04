package behavioral.mediator;

/**
 * 
 * �н���ģʽ Mediator Pattern
 * ��һ���н��������װһϵ�еĶ��󽻻����н���ʹ��������Ҫ��ʽ�Ļ������ã�������ϣ����ҿ��Զ����ĸı�����֮��Ľ�����
 * @author �˵ô��
 *
 */

public class Client {

	public static void main(String[] args) {
		SecurityCouncil unsc = new SecurityCouncil();
		America usa = new America(unsc);
		China china = new China(unsc);
		unsc.setUsa((America) usa);
		unsc.setChina((China) china);
		usa.declare("���������ɻ�Ϊ������");
		china.declare("�й������������й�����Ȩ��");
	}

}
