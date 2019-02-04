package creational.simplefactory;

/*
 * Factory：工厂角色
 * 工厂角色负责实现创建所有实例的内部逻辑
 */

public class OperationFactory {
	public Operation createOperation(String operation) {
		Operation oper = null;
		switch (operation) {
		case "+":
			oper = new OperationAdd();
			break;
		case "-":
			oper = new OperationSub();
			break;
		case "*":
			oper = new OperationMul();
			break;
		case "/":
			oper = new OperationDiv();
			break;
		}
		return oper;
	}
}
