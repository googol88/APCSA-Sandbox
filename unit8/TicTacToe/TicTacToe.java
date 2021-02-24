import java.util.Scanner;

public class TicTacToe {
	
	// 3 x 3 Grid for playing tic tac toe
	private String[][] grid = new String[3][3];
	private Scanner scan = new Scanner(System.in);

	// play one game of tic-tac-toe
	// POST: Game is completed
	// DO NOT CHANGE THIS METHOD
	public void playGame() {
		printBoard();
		String symbol = determineWhoGoesFirst();
		while(!isWinner() && !isTie()) {
			playTurn(symbol);
			symbol = changeSymbol(symbol);
		}
		symbol = changeSymbol(symbol);
		if(isWinner()) {
			System.out.println(symbol + " won the game!");
		}
		else {
			System.out.println("Tie game");
		}
	}
	
	// if computer is playing ("O") - pick random square
	// if person is playing ("X")  - select square to mark
	// POST: Grid is updated to include symbol in chosen square
	public void playTurn(String symbol) {
    System.out.println(symbol + "'s turn");
    if(symbol.equals("X")) { // player's turn
      System.out.print("Enter row: ");
      int row = scan.nextInt();
      while((row < 0 || row > 2)
          || (grid[row][0] != null
          &&  grid[row][1] != null
          &&  grid[row][2] != null)) {
        System.out.println("Row must be unoccupied and between 0 and 2");
        System.out.print("Enter row: ");
        row = scan.nextInt();
      }
      System.out.print("Enter column: ");
      int col = scan.nextInt();
      while((col < 0 || col > 2) || grid[row][col] != null) {
        System.out.println("Column must be unoccupied and between 0 and 2");
        System.out.print("Enter column: ");
        col = scan.nextInt();
      }

      grid[row][col] = "X";
    } else {
      int r;
      int c;
      do {
        r = (int)(Math.random()*3);
        c = (int)(Math.random()*3);
      } while(grid[r][c] != null);
      grid[r][c] = "O";
    }
    System.out.println();
    printBoard();
	}
	
	// Randomly returns whether X (Player) or O (Computer) goes first
	public String determineWhoGoesFirst() {
		return Math.random() > 0.5 ? "O":"X";
	}
	
	// Returns true if there is a winner
	public boolean isWinner() {
    int[][][] winningCombos = {
     {{0, 0}, {0, 1}, {0, 2}},
     {{1, 0}, {1, 1}, {1, 2}},
     {{2, 0}, {2, 1}, {2, 2}},
     
     {{0, 0}, {1, 0}, {2, 0}},
     {{0, 1}, {1, 1}, {2, 1}},
     {{0, 2}, {1, 2}, {2, 2}},
     
     {{0, 0}, {1, 1}, {2, 2}},
     {{0, 2}, {1, 1}, {2, 0}}
    };
    for(int[][] combo : winningCombos) {
      if((grid[combo[0][0]][combo[0][1]] != null // not pretty :(
          &&  grid[combo[1][0]][combo[1][1]] != null
          &&  grid[combo[2][0]][combo[2][1]] != null)
      && grid[combo[0][0]][combo[0][1]].equals(grid[combo[1][0]][combo[1][1]])
      && grid[combo[1][0]][combo[1][1]].equals(grid[combo[2][0]][combo[2][1]])) {
        return true;
      }
    }
		return false;
	}
	
	// Return true if there is a tie
	public boolean isTie() {
    for(int i = 0; i < 3; i++) {
      for(int j = 0; j < 3; j++) {
        if(grid[i][j] == null)
          return false;
      }
    }
		return true;
	}

	// print the board in an easy to read format
	public void printBoard(){
    for(int i = 0; i < 3; i++) {
      System.out.print(" ");
      for(int j = 0; j < 3; j++) {
        System.out.print(grid[i][j]==null ? " " : grid[i][j]);
        if(j < 2) {System.out.print(" | ");}
      }
      System.out.println();
      if(i < 2){System.out.println("---|---|---");}
    }
	}
	
	// Returns the symbol whose turn it is to go next
	// DO NOT CHANGE THIS METHOD
	public String changeSymbol(String symbol) {
		return symbol.equals("X") ? "O":"X";
	}
	
}
