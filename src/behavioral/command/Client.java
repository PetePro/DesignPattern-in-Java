package behavioral.command;

/**
 * 
 * ����ģʽ Command Pattern
 * ��һ�������װΪһ�����󣬴Ӷ�ʹ����ò�ͬ������û����в��������������Ŷӻ��¼������־���Լ�֧�ֿɳ����Ĳ�����
 * @author �˵ô��
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
