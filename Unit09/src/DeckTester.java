/**
 * This is a class that tests the Deck class.
 */
public class DeckTester {

	public static void main(String[] args) {
		String[] ranks = {"Jack, Queen", "King"};
		String[] suits = {"Blue, Red"};
		int[] pointValues = {11,12,13};
		
		Deck deckk = new Deck(ranks, suits, pointValues);
		
		for (int i = 0; i < deckk.size(); i++) {
			deckk.deal();
		}
		System.out.println(deckk);
	}
}
