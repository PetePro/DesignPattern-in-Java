package creational.singleton;

/**
 * 
 * 单例模式 Singleton Pattern
 * 保证一个类仅有一个实例，并提供一个访问它的全局访问点。
 * @author 彼得大帝
 *
 */

public class Client {

	public static void main(String[] args) {
		Singleton instance = Singleton.getInstance();
		instance.showMessage();
	}

}
