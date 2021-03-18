public class Deck {

	private Card[] cards;
	
	public Deck() {
		cards = new Card[Card.ranks.length * Card.suits.length];
		int cardIndex = 0;
		for(String rank: Card.ranks) {
			for(char suit: Card.suits) {
				cards[cardIndex] = new Card(rank, suit);
				cardIndex++;
			}
		}
	}
	
	public void shuffle() {
		for(int i = cards.length-1; i >= 1; i--) {
			int randIndex = (int)(Math.random() * (i + 1));
			Card temp = cards[randIndex];
			cards[randIndex] = cards[i];
			cards[i] = temp;
		}
	}
	
	public int length() {
		return cards.length;
	}
	
	public Card getCard(int i) {
		return cards[i];
	}
	
	@Override
	public String toString() {
		String result = "";
		for(int i = 0; i < cards.length; i++) {
			result += cards[i];
			if(i < cards.length-1) {
				result += ", ";
			}
		}
		return result;
	}
	
}