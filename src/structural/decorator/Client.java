package structural.decorator;

/**
 * 
 * װ��ģʽ Decorate Pattern
 * ��̬�ĸ�һ���������һЩ�����ָ��ͬʱ���ı��书�ܡ�
 * @author �˵ô��
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
