import java.awt.Color;
 
class Main {
 
 static Pacman bob;
 
 public static void main(String[] args) {
  
   int msLives = 5;
   boolean msSicko = true;
   Color msColor = new Color(200, 50, 120);
 
   Pacman pacman = new Pacman();
   Pacman msPacman = new Pacman(msLives, msSicko, msColor);
   Pacman supaPacman = pacman; // alias
   pacman.lives++;

   System.out.println(pacman.lives+", "+pacman.sickoPacmanMode+", "+pacman.color);
   System.out.println(msPacman.lives+", "+msPacman.sickoPacmanMode+", "+msPacman.color);
   System.out.println(supaPacman.lives);
 }
}
