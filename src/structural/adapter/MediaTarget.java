package structural.adapter;

public class MediaTarget implements MediaPlayer {

	MediaAdapter mediaAdapter;

	@Override
	public void play(String audioType, String fileName) {
		if (audioType.equalsIgnoreCase("mp3")) {
			System.out.println("Playing mp3 file. Name: " + fileName);
		} else if (audioType.equalsIgnoreCase("wav") || audioType.equalsIgnoreCase("flac")) {
			mediaAdapter = new MediaAdapter();
			mediaAdapter.play(audioType, fileName);
		} else {
			System.out.println("Invalid media. " + audioType + " format not supported");
		}
	}

}
