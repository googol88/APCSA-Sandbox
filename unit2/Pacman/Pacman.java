import java.awt.Color;
 
public class Pacman{
 int lives;
 boolean sickoPacmanMode;
 Color color;
 
 public Pacman(){
   lives = 3;
   sickoPacmanMode = false;
   color = Color.YELLOW;
 }
 
 public Pacman(int lv, boolean sicko, Color clr){
   lives = lv;
   sickoPacmanMode = sicko;
   color = clr;
 }
}