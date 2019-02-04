package behavioral.observer;

/**
 * 
 * 观察者模式 Observer Pattern
 * 定义一种一对多的依赖关系，让多个观察者对象同时监听某一主题对象。
 * 这个主题对象在发生变化时，会通知所有观察者对象，使它们自动更新自己。
 * @author 彼得大帝
 *
 */

public class Client {

	public static void main(String[] args) {
		BinaryObserver bo=new BinaryObserver();
		OctalObserver oo=new OctalObserver();
		HexObserver ho=new HexObserver();
		
		Subject subject1=new ConsoleSubject("acer");
		subject1.attach(bo);
		subject1.attach(oo);
		subject1.attach(ho);
		subject1.setState(0);
		
		Subject subject2=new ConsoleSubject("hp");
		subject2.attach(bo);
		subject2.attach(ho);
		subject2.detach(ho);
		subject2.setState(1);
	}

}
