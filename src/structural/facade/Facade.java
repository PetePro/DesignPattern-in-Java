package structural.facade;

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
