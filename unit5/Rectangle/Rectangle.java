public class Rectangle {
  // constants
  public static final int MAX_WIDTH = 1000;
  public static final int MAX_HEIGHT = 500;
  public static final int MIN_DIM = 1;
  
  // attributes
  private int x, y, width, height;
  
  // statics
  private static int rectCount = 0;


  public Rectangle() {
    this.x = 0;
    this.y = 0;
    this.width = MAX_WIDTH/2;
    this.height = MAX_HEIGHT/2;
    rectCount++;
  }

  public Rectangle(int dim) {
    if(dim < MIN_DIM) dim = MIN_DIM;
    this.width = (dim > MAX_WIDTH) ? MAX_WIDTH : dim; // not sure why I used a ternary operator here but
    this.height = (dim > MAX_HEIGHT) ? MAX_HEIGHT : dim;
    this.x = 0;
    this.y = 0;
    rectCount++;
  }

  public Rectangle(int width, int height) {
    if(width < MIN_DIM)
      this.width = MIN_DIM;
    else if(width > MAX_WIDTH)
      this.width = MAX_WIDTH;
    else 
      this.width = width;

    if(height < MIN_DIM)
      this.height = MIN_DIM;
    else if(height > MAX_HEIGHT)
      this.height = MAX_HEIGHT;
    else 
      this.height = height;

    this.x = 0;
    this.y = 0;
    rectCount++;
  }

  public Rectangle(int x, int y, int width, int height) {
    this.x = x;
    this.y = y;
    
    if(width < MIN_DIM)
      width = MIN_DIM;
    // I place precedence of making the rectangle fit inside the box even though I know this could create negative values if x is greater than MAX_WIDTH
    if(x + width > MAX_WIDTH)
      this.width = MAX_WIDTH - x;
    else 
      this.width = width;

    if(height < MIN_DIM)
      height = MIN_DIM;
    if(y + height > MAX_HEIGHT)
      this.height = MAX_HEIGHT - y;
    else 
      this.height = height;

    rectCount++;
  }

  // getters
  public static int getRectCount() {
    return rectCount;
  }
  public int getX() {
    return this.x;
  }

  // setters with error handling
  public void setX(int x) {
    if (x + this.width > MAX_WIDTH)
      System.out.println("Invalid x value");
    else
      this.x = x;
    System.out.println(this.x+", "+this.y+", "+this.width+", "+this.height);
  }
  public void setY(int y) {
    if (y + this.height > MAX_HEIGHT)
      System.out.println("Invalid y value");
    else
      this.y = y;
    System.out.println(this.x+", "+this.y+", "+this.width+", "+this.height);
  }

  // instance methods
  public int getPerimeter() {
    return 2*this.width + 2*this.height;
  }

  public int getArea() {
    return this.width * this.height;
  }

  public boolean isInteriorPoint(int px, int py) {
    if((px > this.x && px < this.x + this.width) && (py > this.y && py < this.y + this.height))
      return true;
    return false;
  }

  public boolean hasSameArea(Rectangle other) { // "other" AP naming convention
    return this.getArea() == other.getArea();
  }

  @Override // will break if method not toString
  public String toString() {
    // 6 x 2 rectangle @(0, 0)
    return width + " x " + height + " rectangle @(" + x + ", " + y + ")";
  }
}