package creational.abstractfactory;

public class FactoryHp implements FactoryPC {

	@Override
	public ProductMouse createMouse() {
		ProductMouseHp pmh = new ProductMouseHp();
		return pmh;
	}

	@Override
	public ProductMonitor createMonitor() {
		ProductMonitorHp pmh = new ProductMonitorHp();
		return pmh;
	}

	@Override
	public ProductKeyboard createKeyboard() {
		ProductKeyboardHp pkh = new ProductKeyboardHp();
		return pkh;
	}

}
