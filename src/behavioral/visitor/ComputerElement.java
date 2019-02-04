package behavioral.visitor;

/*
 * Element
 * 定义accept操作，以一个访问者为参数。
 */

public interface ComputerElement {
	public void accept(ComputerVisitor visitor);
}
