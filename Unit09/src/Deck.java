import java.util.ArrayList;

public class Deck {


	private ArrayList<Card> cards;

	private int size;


	/**
	 * Creates a new <code>Deck</code> instance.<BR>
	 * It pairs each element of ranks with each element of suits,
	 * and produces one of the corresponding card.
	 * @param ranks is an array containing all of the card ranks.
	 * @param suits is an array containing all of the card suits.
	 * @param values is an array containing all of the card point values.
	 */
	public Deck(String[] ranks, String[] suits, int[] values) {
		cards = new ArrayList<Card>();
		
		for (int i = 0; i < suits.length; i++) {
			for (int j = 0; j < ranks.length; j++) {
				cards.add(new Card(ranks[j], suits[i], values[j]));
			}
		}
		size = cards.size();
		shuffle();
	}

	public boolean isEmpty() {
		if (size == 0) return true;
		return false;
	}

	public int size() {
		return size;
	}

	public void shuffle() {
		size = cards.size();

		for (int i = cards.size() - 1; i > 0; i--) {
			int r = (int) Math.random()*i;
			Card z = cards.get(r);
			cards.set(r, cards.get(i));
			cards.set(i, z);
	}}

	public Card deal() {
		if (isEmpty()) return null;
		else {
			size--;
			return cards.get(size);
		}
	}

	@Override
	public String toString() {
		String rtn = "size = " + size + "\nUndealt cards: \n";

		for (int k = size - 1; k >= 0; k--) {
			rtn = rtn + cards.get(k);
			if (k != 0) {
				rtn = rtn + ", ";
			}
			if ((size - k) % 2 == 0) {
				// Insert carriage returns so entire deck is visible on console.
				rtn = rtn + "\n";
			}
		}

		rtn = rtn + "\nDealt cards: \n";
		for (int k = cards.size() - 1; k >= size; k--) {
			rtn = rtn + cards.get(k);
			if (k != size) {
				rtn = rtn + ", ";
			}
			if ((k - cards.size()) % 2 == 0) {
				// Insert carriage returns so entire deck is visible on console.
				rtn = rtn + "\n";
			}
		}

		rtn = rtn + "\n";
		return rtn;
	}
}
