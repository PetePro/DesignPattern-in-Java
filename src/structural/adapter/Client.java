package structural.adapter;

public class Client {

	public static void main(String[] args) {
		MediaTarget audioPlayer = new MediaTarget();

		audioPlayer.play("mp3", "beyond the horizon.mp3");
		audioPlayer.play("wav", "alone.wav");
		audioPlayer.play("flac", "far far away.flac");
		audioPlayer.play("avi", "mind me.avi");
	}

}
