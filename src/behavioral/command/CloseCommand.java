package behavioral.command;

public class CloseCommand implements Command {
	
	private Television tv;

	CloseCommand(Television tv) {
		this.tv = tv;
	}

	@Override
	public void excute() {
		this.tv.close();
	}

}
