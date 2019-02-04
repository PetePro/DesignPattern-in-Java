package behavioral.mediator;

/*
 * Colleague ����ͬ����
 * ConcreteColleague�̳��ڴˣ�����ֻ֪���Լ�����Ϊ�����˽�ͬ�µ���Ϊ��������ʶ�н顣
 */

public abstract class Country {
	protected UnitedNations mediator;

	public Country(UnitedNations mediator) {
		this.mediator = mediator;
	}
}
