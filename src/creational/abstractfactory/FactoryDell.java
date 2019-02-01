package creational.abstractfactory;

public class FactoryDell implements FactoryPC {

	@Override
	public ProductMouse createMouse() {
		ProductMouseDell pmd = new ProductMouseDell();
		return pmd;
	}

	@Override
	public ProductMonitor createMonitor() {
		ProductMonitorDell pmd = new ProductMonitorDell();
		return pmd;
	}

	@Override
	public ProductKeyboard createKeyboard() {
		ProductKeyboardDell pkd = new ProductKeyboardDell();
		return pkd;
	}

}
