package structural.flyweight;

/**
 * 
 * 享元模式 Flyweight Pattern
 * 运用共享技术有效支持大量细粒度的对象。
 * @author 彼得大帝
 *
 */

public class Client {

	public static void main(String[] args) {
		WebsiteFactory factory = new WebsiteFactory();
		Website tencent = factory.getPortalWebsite("腾讯");
		tencent.user("马化腾");
		Website wechat = factory.getPortalWebsite("腾讯");
		wechat.user("张小龙");
	}

}
