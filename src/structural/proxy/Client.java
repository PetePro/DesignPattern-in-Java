package structural.proxy;

/**
 * 
 * 代理模式 Proxy Pattern
 * 为其它对象提供一种代理，以控制对这个对象的访问。
 * @author 彼得大帝
 *
 */

public class Client {

	public static void main(String[] args) {
		Proxy p = new Proxy("Leonard ");
		p.jump();
		p.driver();
		p.fight();
	}

}
