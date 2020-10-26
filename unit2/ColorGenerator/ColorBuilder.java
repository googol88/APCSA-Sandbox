import java.awt.Color;

public class ColorBuilder{

  public static Color buildRandom(){
    /* 
        1) Use Math.random() to generate random rgb values between 0 and 255.
        2) Construct this color and return it.
        */
        Color randColor = new Color((int) (Math.random()*255), (int) (Math.random()*255), (int) (Math.random()*255));
        return randColor;
  }
    public static Color buildCustom(int r, int g, int b){
    /* 
        1) Use Math.abs() to make sure rgb values are positive.
        2) Use Math.min() to prevent rgb values over 255
        3) Construct this color and return it.
        */
        r = Math.min(Math.abs(r), 255);
        g = Math.min(Math.abs(g), 255);
        b = Math.min(Math.abs(b), 255);
        Color customColor = new Color(r, g, b);
        return customColor;
  }
}