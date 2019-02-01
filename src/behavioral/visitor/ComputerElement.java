package behavioral.visitor;

public interface ComputerElement {
	public void accept(ComputerVisitor visitor);
}
