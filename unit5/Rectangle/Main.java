class Main {
  public static void main(String[] args) {
    // construct 4 rectangles 1 of each type
    Rectangle rect1 = new Rectangle();
    Rectangle rect2 = new Rectangle(600);
    Rectangle rect3 = new Rectangle(2020, 66);
    Rectangle rect4 = new Rectangle(300, 200, 10, 10);
    Rectangle rect5 = new Rectangle(100, 250, 20, 5);
    
    System.out.println(rect4.hasSameArea(rect5));
    System.out.println(rect4.toString());
  }
}