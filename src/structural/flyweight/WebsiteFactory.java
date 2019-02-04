package structural.flyweight;

/*
 * Flyweight Factory 享元工厂
 * 用来创建并管理Flyweight对象，确保合理共享Flyweight，提供一个已有或创建一个新的实例。
 */

import java.util.HashMap;

public class WebsiteFactory {
	private HashMap<String, Website> website = new HashMap<String, Website>();

	public Website getPortalWebsite(String name) {
		if (!website.containsKey(name)) {
			website.put(name, new PortalWebsite(name));
		}
		return new PortalWebsite(name);
	}

	public Website getTransactionWebsite(String name) {
		if (!website.containsKey(name)) {
			website.put(name, new TransactionWebsite(name));
		}
		return new TransactionWebsite(name);
	}

}
