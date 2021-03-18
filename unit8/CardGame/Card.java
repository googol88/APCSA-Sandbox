public class Card {
	
	public static String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};
	public static char[] suits = {'\u2660', '\u2665', '\u2663', '\u2666'};
	
	protected String rank;
	protected char suit;
	protected int value;
		
	/* precondition: String and suit are valid playing card values.
	 */
	public Card(String rank, char suit) {
		this.rank = rank;
		this.suit = suit;
		this.value = calculateValue();
	}
	
	public int calculateValue() {
		for(int i = 0; i < ranks.length; i++) {
			if(rank.equals(ranks[i])){
				return i;
			}
		}
		return -1;
	}
	
	public int getValue() {
		return value;
	}
	
	@Override
	public String toString() {
		return rank + suit;
	}
}