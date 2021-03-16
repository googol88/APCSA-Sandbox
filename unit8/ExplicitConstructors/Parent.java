// constructor chaining
public class Parent {
  public Parent() {
    System.out.println("Parent() is running");
  }
}

// You can have multiple classes in one file, but only one can be public
class Child extends Parent {
  public Child() {
    System.out.println("Child() is running");
  }  
}

class GrandChild extends Child {
  public GrandChild() {
    System.out.println("GrandChild() is running");
  }  
}

class GreatGrandChild extends GrandChild {
  public GrandChild() {
    System.out.println("GreatGrandChild() is running");
  }  
}