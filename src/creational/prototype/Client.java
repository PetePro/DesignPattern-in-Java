package creational.prototype;

/**
 * 
 * 原型模式 Prototype Pattern
 * 用原型的实例指定创建对象的种类，并且通过拷贝这些原型创建新的对象。
 * @author 彼得大帝
 *
 */

public class Client {

	public static void main(String[] args) throws CloneNotSupportedException {
		Oreo o = new Oreo();
		Dessert clone_oreo = (Dessert) o.clone();
		System.out.println("type: " + clone_oreo.getType());

		Pudding p = new Pudding();
		Dessert clone_pudding = (Dessert) p.clone();
		System.out.println("type: " + clone_pudding.getType());
	}

}
