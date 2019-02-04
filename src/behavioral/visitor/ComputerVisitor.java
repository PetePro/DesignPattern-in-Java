package behavioral.visitor;

/*
 * Visitor
 * 为该对象结构中ConcreteElement的每一个类声明一个visit操作。
 */

public interface ComputerVisitor {

	public void visit(Mouse mouse);

	public void visit(Keyboard keyboard);

	public void visit(Monitor monitor);
}
