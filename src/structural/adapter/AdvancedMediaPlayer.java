package structural.adapter;

/*
 * Adaptee 需要适配的类
 * 该接口与实现该接口的子类均为需要适配的类。
 */

public interface AdvancedMediaPlayer {
	public void playWav(String fileName);

	public void playFlac(String fileName);
}
