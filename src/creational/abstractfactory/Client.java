package creational.abstractfactory;

public class Client {

	public static void main(String[] args) {
		FactoryPC hp = new FactoryHp();
		ProductMouse hpmouse = hp.createMouse();
		hpmouse.getDescription();
		ProductMonitor hpmonitor = hp.createMonitor();
		hpmonitor.getDescription();
		ProductKeyboard hpkeyboard = hp.createKeyboard();
		hpkeyboard.getDescription();

		FactoryPC dell = new FactoryDell();
		ProductMouse dellmouse = dell.createMouse();
		dellmouse.getDescription();
		ProductMonitor dellmonitor = dell.createMonitor();
		dellmonitor.getDescription();
		ProductKeyboard dellkeyboard = dell.createKeyboard();
		dellkeyboard.getDescription();
	}

}
