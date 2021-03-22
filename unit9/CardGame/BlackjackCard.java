/*regular card insttance with a different value calculationnumber card = 
  number card = the number on the card
  face card (J, Q, K) = 10
  ace = 11*/
public class BlackjackCard extends Card {
  public BlackjackCard(String rank, char suit) {
    super(rank, suit);
    value = calculateValue();
  }

  @Override
  public int calculatevalue() {
    /*for(int i = 0; i < ranks.length; i++) {
			if(rank.equals(ranks[i])){
				if(i < 9)
          return i + 2;
        else if (i < 12)
          return 11;
        else if (i == 12)
          return 10;
			}
		}*/
    int i = super.calculateValue();
    if(i < 9)
      return i + 2;
    else if (i < 12)
      return 10;
    else if (i == 12)
      return 11;
		return -1;
  }

  public static void main(String[] args) {
    Card c = new Card("Q", suits[0]);
    BlackjackCard bjc = new BlackjackCard("Q", suits[0]);

    System.out.println(c + " value: " + c.getValue());
    System.out.println(bjc + " value: " + bjc.getValue());

    Card c2 = new Card("A", suits[0]);
    BlackjackCard bjc2 = new BlackjackCard("A", suits[0]);

    System.out.println(c2 + " value: " + c2.getValue());
    System.out.println(bjc2 + " value: " + bjc2.getValue());
  }
}