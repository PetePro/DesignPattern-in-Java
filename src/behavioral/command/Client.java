package behavioral.command;

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
