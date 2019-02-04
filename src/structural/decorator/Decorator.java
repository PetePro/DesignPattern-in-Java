package structural.decorator;

/*
 * Decorator װ�γ�����
 * �̳���Component������������չComponent������Component��˵������֪��Decorator�Ĵ��ڡ�
 */

public abstract class Decorator implements Coffee {
	private String description = "��ֻ��װ��������֪�����������";

	@Override
	public String getDescription() {
		return description;
	}

	@Override
	public double getPrice() {
		return 0;
	}
}
