import java.util.ArrayList;

public class War {

	private Deck deck;
	private ArrayList<Card> playerOne;
	private ArrayList<Card> playerTwo;
	
	public War() {
		deck = new Deck();
		playerOne = new ArrayList<>();
		playerTwo = new ArrayList<>();
		
		deck.shuffle();
		for(int i = 0; i < deck.length(); i+=2) {
			playerOne.add(deck.getCard(i));
			playerTwo.add(deck.getCard(i+1));
		}
	}
	
	public boolean gameIsOver() {
		return playerOne.size() == 0 || playerTwo.size() == 0;
	}
	
	public void fight() {
		ArrayList<Card> lostCards = new ArrayList<>();
		boolean p1_win = false;
		while(true) {
			if(playerOne.get(0).getValue() > playerTwo.get(0).getValue()) {
				p1_win = true;
				System.out.println("P1: " + playerOne.get(0) + " beats " + "P2: " + playerTwo.get(0) + "\n");
				break;
			} else if(playerTwo.get(0).getValue() > playerOne.get(0).getValue()){
				System.out.println("P2: " + playerTwo.get(0) + " beats " + "P1: " + playerOne.get(0) + "\n");
				break;
			} else {
				int warCards = Math.min(Math.min(3, playerOne.size()-1), playerTwo.size()-1);
				for(int i = 0; i < warCards; i++) {
					lostCards.add(playerOne.remove(0));
					lostCards.add(playerTwo.remove(0));
					System.out.print(i+1 + "\n");
				}
				System.out.println("WAR!\n");
			}
		}
		lostCards.add(playerTwo.remove(0));
		lostCards.add(playerOne.remove(0));
		if(p1_win) {
			for(Card card: lostCards) {
				playerOne.add(card);
			}
		} else {
			for(Card card: lostCards) {
				playerTwo.add(card);
			}
		}
	}
	
	public void printScore() {
		System.out.println("P1(" + playerOne.size() + "): " + playerOne);
		System.out.println("P2(" + playerTwo.size() + "): " + playerTwo);
	}
	
	
}
