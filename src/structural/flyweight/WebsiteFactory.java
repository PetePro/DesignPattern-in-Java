package structural.flyweight;

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
