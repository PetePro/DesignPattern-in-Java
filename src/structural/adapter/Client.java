package structural.adapter;

/**
 * 
 * ������ģʽ Adapter Pattern
 * ��һ����Ľӿ�ת���ɿͻ�ϣ��������һ���ӿڡ�
 * ��ģʽʹ��ԭ�����ڽӿڲ����ݶ�����һ��������Щ�����һ������
 * @author �˵ô��
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
