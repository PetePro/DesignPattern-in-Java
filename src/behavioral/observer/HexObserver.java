package behavioral.observer;

public class HexObserver extends Observer {

	@Override
	public void update(String name, int state) {
		System.out.println("Í¨ÖªÕß£º" + name + "£¬" + this.getClass() + " ×´Ì¬£º" + state);
	}

}
