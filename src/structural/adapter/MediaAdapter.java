package structural.adapter;

/*
 * Adapter 适配器类
 * 在内部包装Adaptee对象，把其接口转换成目标接口。
 */

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
