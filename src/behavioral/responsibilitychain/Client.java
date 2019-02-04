package behavioral.responsibilitychain;

/**
 * 
 * 职责链模式 Chain of Responsibility Pattern
 * 使多个对象都有机会处理请求，避免请求发送者和接收者之间的耦合。
 * 将对象连成一条链，沿着链传递请求，直到有一个对象处理他为止。
 * @author 彼得大帝
 *
 */

public class Client {

	private static AbstractLogger getChainOfLoggers() {

		AbstractLogger errorLogger = new ErrorLogger(AbstractLogger.ERROR);
		AbstractLogger debugLogger = new DebugLogger(AbstractLogger.DEBUG);
		AbstractLogger consoleLogger = new ConsoleLogger(AbstractLogger.INFO);

		errorLogger.setSuccessor(debugLogger);
		debugLogger.setSuccessor(consoleLogger);

		return errorLogger;
	}

	public static void main(String[] args) {
		AbstractLogger loggerChain = getChainOfLoggers();

		loggerChain.logMessage(AbstractLogger.INFO, "This is an information.");

		loggerChain.logMessage(AbstractLogger.DEBUG, "This is an debug level information.");

		loggerChain.logMessage(AbstractLogger.ERROR, "This is an error information.");
	}

}
