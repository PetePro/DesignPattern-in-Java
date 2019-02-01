package behavioral.visitor;

public interface ComputerVisitor {

	public void visit(Mouse mouse);

	public void visit(Keyboard keyboard);

	public void visit(Monitor monitor);
}
