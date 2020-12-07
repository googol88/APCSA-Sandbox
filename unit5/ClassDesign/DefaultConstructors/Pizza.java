import java.awt.Color;

public class Pizza{
  private String w;
  private int x;
  private double y;
  private Color z;

  public Pizza(int n){
    x = n;
    z = new Color(n, n, n);
  }

  public void getAttr() {
    System.out.println(w);
    System.out.println(x);
    System.out.println(y);
    System.out.println(z);
  }
}
