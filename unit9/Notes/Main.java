class Main {
  public static void main(String[] args) {
    // acceptable because of polymorphism
    Object name = new String("John");

    // downcasting
    // methods calls have higher precedence than casting
    // (String)name.length() will have a compiler error
    System.out.println(((String)name).length()); 

    // casting primitives - prevent lossy conversion (eg double to int)
    // casting references - downcast to access subclass methods (eg from Object to String)
  }
}