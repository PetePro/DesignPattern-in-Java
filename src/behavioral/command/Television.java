package behavioral.command;

public class Television {

	private String name = "Sony";

	public void open() {
		System.out.println("open TV " + name);
	}

	public void close() {
		System.out.println("close TV " + name);
	}

}
