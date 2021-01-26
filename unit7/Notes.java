import java.util.ArrayList;
class Notes {
  public static void main(String[] args) {
    ArrayList<String> stringArr = new ArrayList<>(); // having new ArrayList<String>() works but not required
    // also has optional parameter ArrayList<>(length) which does not create fixed length but helps performance behind the scenes
    ArrayList<Integer> integerArr = new ArrayList<>(); // use wrapper classes like Double, Character, Boolean
    stringArr.add("World!");
    stringArr.add(0, "Hello"); // overloaded constructor
    // E modifier and type is just placeholder for type of ArrayList<E>
    String world = stringArr.get(1);

    /*Le Olde Times - ArrayListt without specifying type
     *because of Object superclass which *almost* all things deerive from *EXCEPT PRIMITIVES*
     * That's why you can't use a primitive type in ArrayList!!*/
    ArrayList stuff = new ArrayList(); // valid!
    stuff.add(1776);
    stuff.add("I am from le olde past"); // mixing types - how evil >:-)
    System.out.println(stuff);
  }
}