package behavioral.visitor;

/*
 * Visitor
 * Ϊ�ö���ṹ��ConcreteElement��ÿһ��������һ��visit������
 */

public interface ComputerVisitor {

	public void visit(Mouse mouse);

	public void visit(Keyboard keyboard);

	public void visit(Monitor monitor);
}
