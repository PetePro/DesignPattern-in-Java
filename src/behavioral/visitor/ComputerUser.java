package behavioral.visitor;

public class ComputerUser implements ComputerVisitor {

	@Override
	public void visit(Mouse mouse) {
		System.out.println("ComputerUser visiting mouse");
	}

	@Override
	public void visit(Keyboard keyboard) {
		System.out.println("ComputerUser visiting keyboard");
	}

	@Override
	public void visit(Monitor monitor) {
		System.out.println("ComputerUser visiting monitor");
	}

}
