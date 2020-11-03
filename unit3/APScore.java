import java.util.Scanner;
import java.awt.*;
import java.awt.image.BufferedImage;

class APScore {
  
  static Scanner scan = new Scanner(System.in);

  public static int getAPScore(int numCorrect) {
    if (numCorrect <= 28)
      return 1;
    else if (numCorrect <= 36)
      return 2;
    else if (numCorrect <= 46)
      return 3;
    else if (numCorrect <= 61)
      return 4;
    else
      return 5;
  }
  
  public static void printSmiley() {
    // should have done a cowsay, but I just couldn't resist!
    // credit to https://mkyong.com/java/ascii-art-java-example/
    int width = 100;
    int height = 30;

    BufferedImage image = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
    Graphics g = image.getGraphics();
    g.setFont(new Font("SansSerif", Font.BOLD, 24));

    Graphics2D graphics = (Graphics2D) g;
    graphics.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING,
      RenderingHints.VALUE_TEXT_ANTIALIAS_ON);
    graphics.drawString("Nice!", 10, 20);

    System.out.println();
    for (int y = 0; y < height; y++) {
      StringBuilder sb = new StringBuilder();

      for (int x = 0; x < width; x++) {
        sb.append(image.getRGB(x, y) == -16777216 ? " " : "✨");
      }

      if (sb.toString().trim().isEmpty()) {
        continue;
      }

      System.out.println(sb);
    }
  }
  
  public static void main(String[] args) {
    System.out.print("Enter raw score: ");
    int numCorrect = scan.nextInt();

    int score = getAPScore(numCorrect);
    System.out.println("AP Score: " + score);
    if (score >= 4)
      printSmiley();
  }
}