package behavioral.observer;

/*
 * Observer �۲���
 * Ϊ���о���۲��߶���һ���ӿڣ��ڵõ�Subject��֪ͨʱ�����Լ���
 */

public abstract class Observer {

	protected Subject subject;

	public abstract void update(String name, int state);
}
