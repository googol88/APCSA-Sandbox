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
    
    Color x = new Color(153, 13, 255);
    Color tr = new Color(138, 218, 222, 100);
    Color y = new Color(0.5f, 0.6f, 0.85f);
    Color ty = new Color(0.5f, 0.6f, 0.85f, 0.5f);
    Color z = new Color(0x12D687);
    Color tz = new Color(0x7912D687, true);

    topLeft.setBackground(x);
    topCenter.setBackground(tr);
    topRight.setBackground(y);
    bottomLeft.setBackground(ty);
    bottomCenter.setBackground(z);
    bottomRight.setBackground(tz);

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