package behavioral.template;

/*
 * Template 模板
 * 实现一个模板方法，定义算法的逻辑骨架。
 * 具体行为在子类中实现。
 */

public abstract class Game {
	abstract void initialize();

	abstract void startPlay();

	abstract void endPlay();

	// 模板
	public final void play() {
		initialize();
		startPlay();
		endPlay();
	}
}
