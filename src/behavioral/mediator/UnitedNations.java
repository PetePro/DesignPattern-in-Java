package behavioral.mediator;

/*
 * Mediator 抽象中介者类
 * 定义同事对象到中介者对象的接口。
 */

public abstract class UnitedNations {
	abstract void declare(String message, Country colleague);
}
