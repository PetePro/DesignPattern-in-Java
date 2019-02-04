package creational.builder;

/**
 * 
 * 建造者模式 Builder Pattern
 * 将一个复杂对象的构建与它的表示分离，使得同样的构建过程可以创建不同的表示。
 * @author 彼得大帝
 * Director 指挥者类的实现包含在了主程序中。
 *
 */

public class Client {

	public static void main(String[] args) {
		MealBuilder mealBuilder = new MealBuilder();

		Meal meal1 = mealBuilder.prepareMeal_A();
		System.out.println("Meal A: ");
		meal1.showItems();
		System.out.println("Total Cost: " + meal1.getCost());

		Meal meal2 = mealBuilder.prepareMeal_B();
		System.out.println("\n\nMeal B: ");
		meal2.showItems();
		System.out.println("Total Cost: " + meal2.getCost());
	}

}
