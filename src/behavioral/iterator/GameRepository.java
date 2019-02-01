package behavioral.iterator;

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
