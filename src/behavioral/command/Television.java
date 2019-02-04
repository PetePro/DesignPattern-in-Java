package behavioral.command;

/*
 * Receiver
 * 知道如何实施与执行一个与请求相关的操作。
 */

public class Television {

	private String name = "Sony";

	public void open() {
		System.out.println("open TV " + name);
	}

	public void close() {
		System.out.println("close TV " + name);
	}

}
