package behavioral.strategy;

public class Client {

	public static void main(String[] args) {
		Context con=new Context(new CashReturn(300, 100));
		System.out.println(con.getCashMethod(400));
	}

}
