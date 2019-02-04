package structural.facade;

/*
 * Facade 外观类
 * 将用户请求传给适当的子系统对象。
 */

public class Facade {
	private Shape circle;
	private Shape square;

	public Facade() {
		circle = new Circle();
		square = new Square();
	}

	public void drawCircle() {
		circle.draw();
	}

	public void drawSquare() {
		square.draw();
	}
}
