package behavioral.mediator;

/**
 * 
 * 中介者模式 Mediator Pattern
 * 用一个中介对象来封装一系列的对象交互。中介者使各对象不需要显式的互相引用，降低耦合，而且可以独立的改变它们之间的交互。
 * @author 彼得大帝
 *
 */

public class Client {

	public static void main(String[] args) {
		SecurityCouncil unsc = new SecurityCouncil();
		America usa = new America(unsc);
		China china = new China(unsc);
		unsc.setUsa((America) usa);
		unsc.setChina((China) china);
		usa.declare("美国将引渡华为孟晚舟");
		china.declare("中国将保护海外中国公民权利");
	}

}
