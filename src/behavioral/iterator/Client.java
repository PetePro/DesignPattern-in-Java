package behavioral.iterator;

/**
 * 
 * ������ģʽ Iterator Pattern
 * �ṩһ�ַ���˳�����һ���ۺ϶����еĸ���Ԫ�أ����ֲ���¶�ö�����ڲ���ʾ��
 * @author �˵ô��
 *
 */

public class Client {

	public static void main(String[] args) {
		GameRepository nameRepository = new GameRepository();

		for (Iterator iter = nameRepository.getIterator(); iter.hasNext();) {
			String name = (String) iter.next();
			System.out.println("Name : " + name);
		}
	}

}
