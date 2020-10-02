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
    
    // colors
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
    
    // define labels
    JLabel tlLab = new JLabel("153, 13, 255");
    topLeft.add(tlLab);
    JLabel tcLab = new JLabel("138, 218, 222, 100");
    topCenter.add(tcLab);
    JLabel trLab = new JLabel("0.5f, 0.6f, 0.85f");
    topRight.add(trLab);
    JLabel blLab = new JLabel("0.5f, 0.6f, 0.85f, 0.5f");
    bottomLeft.add(blLab);
    JLabel bcLab = new JLabel("0x12D687");
    bottomCenter.add(bcLab);
    JLabel brLab = new JLabel("0x7912D687, true");
    bottomRight.add(brLab);

    // label typeface
    Font font = new Font("Serif", Font.BOLD, 18);
    tlLab.setFont(font);
    tcLab.setFont(font);
    trLab.setFont(font);
    blLab.setFont(font);
    bcLab.setFont(font);
    brLab.setFont(font);

    // label color
    Color txtColor = Color.RED.darker().darker();
    tlLab.setForeground(txtColor);
    tcLab.setForeground(txtColor);
    trLab.setForeground(txtColor);
    blLab.setForeground(txtColor);
    bcLab.setForeground(txtColor);
    brLab.setForeground(txtColor);

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