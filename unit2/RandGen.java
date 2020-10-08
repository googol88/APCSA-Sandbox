import java.util.Random;

class RandGen {
  public static void main(String[] args) {
    // System.out.println("Hello world!");
    Random randGen = new Random();
    randGen.setSeed(13);
    System.out.println(randGen.nextInt(10));
  }
}