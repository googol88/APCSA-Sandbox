import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
class Swing {
  public static void main(String[] args) {
    // creating objects
    JFrame window = new JFrame("☺");
    JPanel panel = new JPanel();
    JButton btn1 = new JButton("Change color");
    JButton btn2 = new JButton("Change orientation");
    JButton btn3 = new JButton("Get HSV color");
    JButton btn4 = new JButton("Darken color");
    // Extra button :P
    JButton btn5 = new JButton("Lighten color");
    
    // color objects
    Color orange = new Color(230, 194, 153);
    Color green = new Color(163, 219, 201);

    // using objects
    window.setSize(225, 400);
    window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    panel.setBackground(orange);

    // button logic
    btn1.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        // method is event handler, passes event e
        panel.setBackground((panel.getBackground() == orange) ? green : orange);
      }
    });
    btn2.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        if (window.getSize().width == 225) {
          window.setSize(400, 225);
          System.out.println("Landscape mode activated");
        } else {
          window.setSize(225, 400);
          System.out.println("Portrait mode activated");
        }
      }
    });
    btn3.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        float[] hsb = Color.RGBtoHSB(
          panel.getBackground().getRed(),
          panel.getBackground().getGreen(),
          panel.getBackground().getBlue(),
          null
        );
        System.out.println("HSV ["+(int) (hsb[0]*360.0)+", "+(int) (hsb[1]*100.0)+", "+(int) (hsb[2]*100.0)+"]");
      }
    });
    btn4.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        panel.setBackground(panel.getBackground().darker());
        System.out.println("Background darkened");
      }
    });
    btn5.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        panel.setBackground(panel.getBackground().brighter());
        System.out.println("Background brightened");
      }
    });

    // build GUI and display
    window.setVisible(true);
    panel.add(btn1);
    panel.add(btn2);
    panel.add(btn3);
    panel.add(btn4);
    panel.add(btn5);
    window.add(panel);
  }
}