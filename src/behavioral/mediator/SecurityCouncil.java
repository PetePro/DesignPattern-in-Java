package behavioral.mediator;

public class SecurityCouncil extends UnitedNations {

	private America usa;
	private China china;

	public void setUsa(America usa) {
		this.usa = usa;
	}

	public void setChina(China china) {
		this.china = china;
	}

	@Override
	void declare(String message, Country colleague) {
		if (usa == colleague) {
			china.getMessage(message);
		} else {
			usa.getMessage(message);
		}
	}

}
