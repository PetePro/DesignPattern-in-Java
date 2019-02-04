package structural.facade;

/**
 * 
 * 外观模式 Facade
 * 为子系统提供一致的界面，此模式定义了一个高层接口，这个接口使得这一子系统更易使用。
 * @author 彼得大帝
 *
 */

public class Client {

	public static void main(String[] args) {
		Facade facade = new Facade();
		facade.drawCircle();
		facade.drawSquare();
	}

}
