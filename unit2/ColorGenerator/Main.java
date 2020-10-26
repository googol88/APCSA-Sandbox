import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

class Main {
  public static void main(String[] args) {
    JFrame frame = new JFrame("Color Generator");
    JPanel panel = new JPanel();
    JLabel rLab = new JLabel("red");
    JLabel gLab = new JLabel("green");
    JLabel bLab = new JLabel("blue");
    JTextField rTxt = new JTextField(4);
    JTextField gTxt = new JTextField(4);
    JTextField bTxt = new JTextField(4);
    rTxt.setText("255");
    gTxt.setText("255");
    bTxt.setText("255");
    

    JButton customBtn = new JButton("Custom");
    JButton randomBtn = new JButton("Random");
    
    frame.setSize(600, 600);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    panel.setBackground(Color.white);
    
    customBtn.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        /* 
        1) get the text from the input boxes and use Integer.parseInt() to turn them into ints.
        2) pass these int values to your buildCustom() method
        3) set the background to this color
        4) re-populate the text fields in case changes were made use `setText()` 
        */
        int red = Integer.parseInt(rTxt.getText());
        int green = Integer.parseInt(gTxt.getText());
        int blue = Integer.parseInt(bTxt.getText());
        Color color = ColorBuilder.buildCustom(red, green, blue);
        panel.setBackground(color);
        rTxt.setText(Integer.toString(color.getRed()));
        gTxt.setText(Integer.toString(color.getGreen()));
        bTxt.setText(Integer.toString(color.getBlue()));
      }
    });
    randomBtn.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        /* 
        1) get random color using your static method in Color Builder class
        2) set this random color as your panel background
        3) populate the text fields with setText() 
        */
        Color randColor = ColorBuilder.buildRandom();
        panel.setBackground(randColor);
        rTxt.setText(Integer.toString(randColor.getRed()));
        gTxt.setText(Integer.toString(randColor.getGreen()));
        bTxt.setText(Integer.toString(randColor.getBlue()));
      }
    });
 
    panel.add(rLab);
    panel.add(rTxt);
    panel.add(gLab);
    panel.add(gTxt);
    panel.add(bLab);
    panel.add(bTxt);
    panel.add(customBtn);
    panel.add(randomBtn);
    frame.add(panel);
    frame.setVisible(true);
  }
}