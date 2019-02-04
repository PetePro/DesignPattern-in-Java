package creational.prototype;

/*
 * Prototype 原型类
 * 声明自Cloneable接口，关键是clone方法。
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
