import java.util.ArrayList;

public class PolyTest {
  public static void main(String[] args) {
    ArrayList<Parent> testList = new ArrayList<>();
    testList.add(new Child1());
    Parent polyChild = new Child2(); // polymorphism - it works!
    testList.add(polyChild);
    Child2 childChild = new Child2(); // it still works! since it's still subclass of Parent
    testList.add(childChild);
  }
}
class Parent {

}
class Child1 extends Parent {

}
class Child2 extends Parent {

}