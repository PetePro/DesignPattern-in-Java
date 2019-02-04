package behavioral.strategy;

/**
 * 
 * 策略模式 Strategy Pattern
 * 它定义了算法家族，分别封装起来，让它们之间可以互相替换，让算法的变化不会影响到使用算法的用户。
 * @author 彼得大帝
 *
 */

public class Client {

	public static void main(String[] args) {
		Context con=new Context(new CashReturn(300, 100));
		System.out.println(con.getCashMethod(400));
	}

}
