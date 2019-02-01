package behavioral.templatemethod;

public abstract class Game {
	abstract void initialize();

	abstract void startPlay();

	abstract void endPlay();

	// ģ��
	public final void play() {
		initialize();
		startPlay();
		endPlay();
	}
}
