package creational.builder;

/*
 * Product 产品
 * 由多个部件产品组成。
 */

import java.util.ArrayList;
import java.util.List;

public class Meal {
	private List<Food> items = new ArrayList<Food>();

	public void addItem(Food item) {
		items.add(item);
	}

	public float getCost() {
		float cost = 0.0f;
		for (Food item : items) {
			cost += item.price();
		}
		return cost;
	}

	public void showItems() {
		for (Food item : items) {
			System.out.print("Item : " + item.name());
			System.out.println(", Price : " + item.price());
		}
	}
}
