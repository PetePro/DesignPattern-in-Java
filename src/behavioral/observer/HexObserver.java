package behavioral.observer;

public class HexObserver extends Observer {

	@Override
	public void update(String name, int state) {
		System.out.println("֪ͨ�ߣ�" + name + "��" + this.getClass() + " ״̬��" + state);
	}

}
