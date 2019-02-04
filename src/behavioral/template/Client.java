package behavioral.template;

/**
 * 
 * 模板模式 Template Pattern
 * 定义一个操作中的算法骨架，将一些步骤延迟到子类中实现。
 * 模板方法使得子类可以不改变一个算法的结构即可重定义该算法的某些特定步骤。
 * @author 彼得大帝
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
