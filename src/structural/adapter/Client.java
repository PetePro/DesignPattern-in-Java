package structural.adapter;

/**
 * 
 * 适配器模式 Adapter Pattern
 * 将一个类的接口转换成客户希望的另外一个接口。
 * 该模式使得原本由于接口不兼容而不能一起工作的那些类可以一起工作。
 * @author 彼得大帝
 *
 */

public class Client {

	public static void main(String[] args) {
		MediaTarget audioPlayer = new MediaTarget();

		audioPlayer.play("mp3", "beyond the horizon.mp3");
		audioPlayer.play("wav", "alone.wav");
		audioPlayer.play("flac", "far far away.flac");
		audioPlayer.play("avi", "mind me.avi");
	}

}
