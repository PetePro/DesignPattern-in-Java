package behavioral.visitor;

/*
 * Element
 * ����accept��������һ��������Ϊ������
 */

public interface ComputerElement {
	public void accept(ComputerVisitor visitor);
}
