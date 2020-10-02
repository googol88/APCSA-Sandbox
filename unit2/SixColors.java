import javax.swing.*;
import java.awt.*;

class SixColors {
  public static void main(String[] args) {
    JFrame frame = new JFrame("Six Colors");
    JPanel mainPanel = new JPanel();
    JPanel topLeft = new JPanel();
    JPanel topCenter = new JPanel();
    JPanel topRight = new JPanel();
    JPanel bottomLeft = new JPanel();
    JPanel bottomCenter = new JPanel();
    JPanel bottomRight = new JPanel();
    GridLayout grid = new GridLayout(2, 3);

    topLeft.setBackground(Color.RED);
    topCenter.setBackground(Color.ORANGE);
    topRight.setBackground(Color.YELLOW);
    bottomLeft.setBackground(Color.GREEN);
    bottomCenter.setBackground(Color.BLUE);
    bottomRight.setBackground(Color.MAGENTA);

    mainPanel.setLayout(grid);
    mainPanel.add(topLeft);
    mainPanel.add(topCenter);
    mainPanel.add(topRight);
    mainPanel.add(bottomLeft);
    mainPanel.add(bottomCenter);
    mainPanel.add(bottomRight);

    frame.setSize(800, 600);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.add(mainPanel);
    frame.setVisible(true);
  }
}