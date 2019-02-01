package creational.builder;

public class MealBuilder {
	public Meal prepareMeal_A() {
		Meal meal = new Meal();
		meal.addItem(new BeefBurger());
		meal.addItem(new Cola());
		return meal;
	}

	public Meal prepareMeal_B() {
		Meal meal = new Meal();
		meal.addItem(new ChickenBurger());
		meal.addItem(new Juice());
		meal.addItem(new Cola());
		return meal;
	}
}
