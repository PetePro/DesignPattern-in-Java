package behavioral.command;

public class OpenCommand implements Command {

	private Television tv;

	OpenCommand(Television tv) {
		this.tv = tv;
	}

	@Override
	public void excute() {
		this.tv.open();
	}

}
