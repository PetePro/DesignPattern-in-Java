package behavioral.template;

public class GameOverwatch extends Game {

	@Override
	void initialize() {
		System.out.println("Overwatch initializing");
	}

	@Override
	void startPlay() {
		System.out.println("Entering Overwatch");
	}

	@Override
	void endPlay() {
		System.out.println("Quitting Overwatch");
	}

}
