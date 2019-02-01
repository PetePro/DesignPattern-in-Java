package structural.flyweight;

public class Client {

	public static void main(String[] args) {
		WebsiteFactory factory = new WebsiteFactory();
		Website tencent = factory.getPortalWebsite("腾讯");
		tencent.user("马化腾");
		Website wechat = factory.getPortalWebsite("腾讯");
		wechat.user("张小龙");
	}

}
