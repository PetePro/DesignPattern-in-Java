package structural.adapter;

public class MediaAdapter implements MediaPlayer {

	AdvancedMediaPlayer advancedMusicPlayer;

	@Override
	public void play(String audioType, String fileName) {
		if (audioType.equalsIgnoreCase("wav")) {
			advancedMusicPlayer = new WAVPlayer();
			advancedMusicPlayer.playWav(fileName);
		} else if (audioType.equalsIgnoreCase("flac")) {
			advancedMusicPlayer = new FLACPlayer();
			advancedMusicPlayer.playFlac(fileName);
		}
	}

}
