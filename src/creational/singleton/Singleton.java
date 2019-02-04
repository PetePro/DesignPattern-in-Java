package creational.singleton;

/*
 * Singleton类
 * 将构造方法定义为private，保证无法从外界实例化此类。
 * 提供getInstance方法，允许客户访问它的唯一实例。
 */

public class Singleton {
	private static Singleton instance = new Singleton();

	private Singleton() {
	}

	public static Singleton getInstance() {
		return instance;
	}

	public void showMessage() {
		System.out.println("Hello World!");
	}
}
