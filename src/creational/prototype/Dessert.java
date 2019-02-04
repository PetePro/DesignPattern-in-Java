package creational.prototype;

/*
 * Prototype ԭ����
 * ������Cloneable�ӿڣ��ؼ���clone������
 */

public abstract class Dessert implements Cloneable {
	protected String type;

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	abstract void makeDessert();

	public Object clone() throws CloneNotSupportedException {
		return (Dessert) super.clone();
	}

}
