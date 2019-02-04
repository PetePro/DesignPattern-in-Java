package behavioral.template;

/*
 * Template ģ��
 * ʵ��һ��ģ�巽���������㷨���߼��Ǽܡ�
 * ������Ϊ��������ʵ�֡�
 */

public abstract class Game {
	abstract void initialize();

	abstract void startPlay();

	abstract void endPlay();

	// ģ��
	public final void play() {
		initialize();
		startPlay();
		endPlay();
	}
}
