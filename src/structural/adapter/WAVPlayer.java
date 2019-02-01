package structural.adapter;

public class WAVPlayer implements AdvancedMediaPlayer {

	@Override
	public void playWav(String fileName) {
		System.out.println("Playing wav file. Name: " + fileName);
	}

	@Override
	public void playFlac(String fileName) {
		// TODO Auto-generated method stub

	}

}
