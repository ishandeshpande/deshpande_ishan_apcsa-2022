public class Card {

	private String suit;
	private String rank;
	private int pointValue;

	public Card() {
		suit = "";
		rank = "";
		pointValue = 0;
	}
	
	public Card(String cardRank, String cardSuit, int cardPointValue) {
		suit = cardSuit;
		rank = cardRank;
		pointValue = cardPointValue;
	}

	public String suit() {
		return suit;
   }

	public String rank() {
		return rank;
	}

	public int pointValue() {
		return pointValue;
	}

	public boolean matches(Card otherCard) {
		if (otherCard.suit().equals(suit) && otherCard.rank().equals(rank) && otherCard.pointValue == pointValue)
			return true;
		return false;
	}


	@Override
	public String toString() {
		return rank + " of " + suit + " (point value = " + pointValue + ")";
	}
}
