package behavioral.responsibilitychain;

/*
 * Handler
 * 定义一个处理请求的接口。
 * ConcreteHandler继承于此，处理所负责的请求。可访问他的后继者。
 */

public abstract class AbstractLogger {
	public static int INFO = 1;
	public static int DEBUG = 2;
	public static int ERROR = 3;

	protected int level;

	protected AbstractLogger nextLogger;

	public void setSuccessor(AbstractLogger nextLogger) {
		this.nextLogger = nextLogger;
	}

	public void logMessage(int level, String message) {
		if (this.level <= level) {
			write(message);
		}
		if (nextLogger != null) {
			nextLogger.logMessage(level, message);
		}
	}

	abstract protected void write(String message);
}
