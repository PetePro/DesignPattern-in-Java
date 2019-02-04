package structural.flyweight;

/**
 * 
 * ��Ԫģʽ Flyweight Pattern
 * ���ù�������Ч֧�ִ���ϸ���ȵĶ���
 * @author �˵ô��
 *
 */

public class Client {

	public static void main(String[] args) {
		WebsiteFactory factory = new WebsiteFactory();
		Website tencent = factory.getPortalWebsite("��Ѷ");
		tencent.user("����");
		Website wechat = factory.getPortalWebsite("��Ѷ");
		wechat.user("��С��");
	}

}
