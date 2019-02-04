package behavioral.command;

/**
 * 
 * 命令模式 Command Pattern
 * 将一个请求封装为一个对象，从而使你可用不同请求对用户进行参数化；对请求排队或记录请求日志，以及支持可撤销的操作。
 * @author 彼得大帝
 *
 */

public class Client {

	public static void main(String[] args) {
		Television tv = new Television();
		Command open = new OpenCommand(tv);
		Command close = new CloseCommand(tv);
		Controller c = new Controller();
		c.setCommand(open);
		c.setCommand(close);
		c.excuteCommand();
	}

}
