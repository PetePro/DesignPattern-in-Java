package behavioral.template;

/**
 * 
 * ģ��ģʽ Template Pattern
 * ����һ�������е��㷨�Ǽܣ���һЩ�����ӳٵ�������ʵ�֡�
 * ģ�巽��ʹ��������Բ��ı�һ���㷨�Ľṹ�����ض�����㷨��ĳЩ�ض����衣
 * @author �˵ô��
 *
 */

public class Client {

	public static void main(String[] args) {
		Game game = new GameOverwatch();
		game.play();
		System.out.println();
		game = new GameStarcraft();
		game.play();
	}

}
