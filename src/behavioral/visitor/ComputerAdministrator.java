package behavioral.visitor;

public class ComputerAdministrator implements ComputerVisitor {

	@Override
	public void visit(Mouse mouse) {
		System.out.println("ComputerAdministrator visiting mouse");
	}

	@Override
	public void visit(Keyboard keyboard) {
		System.out.println("ComputerAdministrator visiting keyboard");
	}

	@Override
	public void visit(Monitor monitor) {
		System.out.println("ComputerAdministrator visiting monitor");
	}

}
