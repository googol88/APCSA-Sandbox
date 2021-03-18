public class Main {
	
	public static void main(String[] args) {
		War war = new War();
		int rounds = 0;
		while(!war.gameIsOver()) {
			war.printScore();
			System.out.println("");
			war.fight();
			rounds++;
			try {
				Thread.sleep(1000);
			} catch(Exception e) {
				System.out.println(e.getMessage());
			}
			if(rounds >= 1000) break;
		}
		System.out.println("Game ended in " + rounds + " rounds");
		war.printScore();
		
	}

}