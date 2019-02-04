package behavioral.iterator;

/**
 * 
 * 迭代器模式 Iterator Pattern
 * 提供一种方法顺序访问一个聚合对象中的各个元素，而又不暴露该对象的内部表示。
 * @author 彼得大帝
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
