import javax.swing.JPanel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.Timer;
import java.util.Random;

public class RainDrops extends JPanel implements ActionListener{

  public static final int W = 500;
  public static final int H = 500;
  public static final int DELAY = 25;

  private Timer timer;
  private int x, y, rad;
  private Color dotColor;
  private Random randGen;

  public RainDrops(){
    this.setPreferredSize(new Dimension(W, H));
    randGen = new Random();
    timer = new Timer(DELAY, this);
    timer.start();
  }

  @Override
  public void paintComponent(Graphics g){
    g.setColor(dotColor);
    g.fillRoundRect(x, y, rad, rad, rad/2, rad/2);
  }

  @Override
  public void actionPerformed(ActionEvent event){
    this.randomizeStuff();
    repaint();
  }

  private void randomizeStuff(){
    dotColor = new Color(0, randGen.nextInt(128) + 127, randGen.nextInt(128), 30);
    rad = randGen.nextInt(20) + 10;
    x = (int)(randGen.nextInt(H)); // Math.abs(randGen.nextGaussian()*W/4)
    y = (int)(H-Math.abs(randGen.nextGaussian()*H/4));
  }


}