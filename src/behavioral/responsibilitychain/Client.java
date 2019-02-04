package behavioral.responsibilitychain;

/**
 * 
 * ְ����ģʽ Chain of Responsibility Pattern
 * ʹ��������л��ᴦ�����󣬱����������ߺͽ�����֮�����ϡ�
 * ����������һ��������������������ֱ����һ����������Ϊֹ��
 * @author �˵ô��
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
