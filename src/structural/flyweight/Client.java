package structural.flyweight;

public class Client {

	public static void main(String[] args) {
		WebsiteFactory factory = new WebsiteFactory();
		Website tencent = factory.getPortalWebsite("��Ѷ");
		tencent.user("����");
		Website wechat = factory.getPortalWebsite("��Ѷ");
		wechat.user("��С��");
	}

}
