package structural.bridge;

/**
 * 
 * 桥接模式 Bridge Pattern
 * 将抽象部分与他的实现部分分离，使他们都可以独立地变化。
 * @author 彼得大帝
 *
 */

public class Client {

	public static void main(String[] args) {
		Phone mi5c = new MI("5C", new Quark());
		mi5c.run();
		Phone mate10 = new Huawei("mate 10", new Bilibili());
		mate10.run();
		mate10 = new Huawei("mate 10", new Quark());
		mate10.run();
	}

}
