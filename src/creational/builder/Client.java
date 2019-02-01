package creational.builder;

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
