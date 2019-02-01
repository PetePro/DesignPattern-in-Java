package behavioral.templatemethod;

public class Client {

	public static void main(String[] args) {
		Game game = new GameOverwatch();
		game.play();
		System.out.println();
		game = new GameStarcraft();
		game.play();
	}

}
