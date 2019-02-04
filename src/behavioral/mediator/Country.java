package behavioral.mediator;

/*
 * Colleague 抽象同事类
 * ConcreteColleague继承于此，它们只知道自己的行为，不了解同事的行为，但都认识中介。
 */

public abstract class Country {
	protected UnitedNations mediator;

	public Country(UnitedNations mediator) {
		this.mediator = mediator;
	}
}
