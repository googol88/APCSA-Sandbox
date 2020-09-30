import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
class Swing {
  public static void main(String[] args) {
    // creating objects
    JFrame window = new JFrame("Lab 4");
    JPanel panel = new JPanel();
    JButton btn1 = new JButton("Click Me!");
    // color objects
    Color megan = new Color(247, 198, 231);
    Color sanjay = new Color(197, 75, 153);

    // using objects
    window.setSize(500, 500);
    window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    panel.setBackground(megan);

    // button logic
    btn1.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        // method is event handler, passes event e
        panel.setBackground((panel.getBackground() == megan) ? sanjay : megan);
      }
    });

    // build GUI and display
    window.setVisible(true);
    panel.add(btn1);
    window.add(panel);
    System.out.println("Hello?");
  }
}