package behavioral.command;

/*
 * Command
 * 用来声明执行操作的接口。
 * ConcreteCommand继承于此，将一个接收者对象绑定于一个动作，调用接收者相应操作。
 */

public interface Command {
	public void excute();
}
