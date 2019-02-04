package behavioral.template;

public class GameStarcraft extends Game {

	@Override
	void initialize() {
		System.out.println("Starcraft initializing");
	}

	@Override
	void startPlay() {
		System.out.println("Entering Starcraft");
	}

	@Override
	void endPlay() {
		System.out.println("Quitting Starcraft");
	}

}
