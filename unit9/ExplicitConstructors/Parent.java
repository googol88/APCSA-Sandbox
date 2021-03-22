// constructor chaining
public class Parent { // technically extends Object
  public Parent() {
    System.out.println("Parent() is running");
  }
  public static void main(String[] args) {}
}

// You can have multiple classes in one file, but only one can be public
class Child extends Parent {
  public Child() {
    System.out.println("Child() is running");
  }  
}

class GrandChild extends Child {
  // implicit call to Child w. super() before constructor runs
  public GrandChild() {
    System.out.println("GrandChild() is running");
  }  
}

class GreatGrandChild extends GrandChild {
  /* freebie {
    implicit call to super(), calling GrandChild
  }*/
  // no args, implicit constructor
  public static void main(String[] args) {
    GreatGrandChild bobIV = new GreatGrandChild();
    // parent to grandchild
  }
}