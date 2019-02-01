package structural.adapter;

public class FLACPlayer implements AdvancedMediaPlayer {

	@Override
	public void playWav(String fileName) {
		// TODO Auto-generated method stub

	}

	@Override
	public void playFlac(String fileName) {
		System.out.println("Playing flac file. Name: " + fileName);
	}

}
