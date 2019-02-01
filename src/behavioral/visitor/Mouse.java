package behavioral.visitor;

public class Mouse implements ComputerElement {
	@Override
	public void accept(ComputerVisitor visitor) {
		visitor.visit(this);
	}
}
