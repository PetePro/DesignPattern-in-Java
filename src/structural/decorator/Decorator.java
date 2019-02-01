package structural.decorator;

public class Decorator implements Coffee {
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
