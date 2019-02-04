package behavioral.iterator;

/*
 * 实现于Container
 * 类中有实现于Iterator的类种类，以此来封装内部行为。
 */

public class GameRepository implements Container {

	public String names[] = { "World of Warcraft", "Diablo", "Starcraft", "HearthStone", "Heros of the Storm",
			"Overwatch" };

	@Override
	public Iterator getIterator() {
		return new GameIterator();
	}

	private class GameIterator implements Iterator {

		int index;

		@Override
		public boolean hasNext() {
			if (index < names.length)
				return true;
			return false;
		}

		@Override
		public Object next() {
			if (this.hasNext())
				return names[index++];
			return null;
		}

	}

}
