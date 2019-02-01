package behavioral.visitor;

public class Keyboard implements ComputerElement {
	@Override
	public void accept(ComputerVisitor visitor) {
		visitor.visit(this);
	}
}
