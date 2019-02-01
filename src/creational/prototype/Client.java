package creational.prototype;

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
