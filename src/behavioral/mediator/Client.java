package behavioral.mediator;

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
