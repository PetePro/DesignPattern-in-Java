package behavioral.visitor;

public class Monitor implements ComputerElement {
	@Override
	public void accept(ComputerVisitor visitor) {
		visitor.visit(this);
	}
}
