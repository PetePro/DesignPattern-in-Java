package structural.decorator;

/**
 * 
 * 装饰模式 Decorate Pattern
 * 动态的给一个对象添加一些额外的指责，同时不改变其功能。
 * @author 彼得大帝
 *
 */

public class Client {

	public static void main(String[] args) {
		Coffee coffee = new CoffeeBeanA();
		coffee = new MilkDecorator(coffee);
		System.out.println(coffee.getDescription());
		System.out.println(coffee.getPrice());
		System.out.println();
		coffee = new SugarDecorator(coffee);
		System.out.println(coffee.getDescription());
		System.out.println(coffee.getPrice());
	}

}
