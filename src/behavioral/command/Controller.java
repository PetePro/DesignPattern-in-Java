package behavioral.command;

/*
 * Invoker
 * 要求命令执行请求。
 */

import java.util.ArrayList;
import java.util.List;

public class Controller {
	private List<Command> commands = new ArrayList<Command>();

	public void setCommand(Command command) {
		commands.add(command);
	}

	public void excuteCommand() {
		for (Command command : commands) {
			command.excute();
		}
	}
}
