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
    JButton btn1 = new JButton("Click Me!");
    JButton btn2 = new JButton("Change orientation");
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
        // method is event handler, passes event e
        window.setSize(400, 225);
        //if (window.getSize().w == )
        System.out.println(window.getSize());
        //panel.setBackground((panel.getBackground() == orange) ? green : orange);
      }
    });

    // build GUI and display
    window.setVisible(true);
    panel.add(btn1);
    panel.add(btn2);
    window.add(panel);
    System.out.println("Hello?");
  }
}