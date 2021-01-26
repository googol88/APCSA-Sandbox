import java.util.ArrayList;

class Increment {
  public static void addToEach(ArrayList<Integer> numbers, int increase) {
    for (int i = 0; i < numbers.size(); i++) {
      numbers.set(i, numbers.get(i) + increase);
    }
  }
  public static void main(String[] args) {
    ArrayList<Integer> example = new ArrayList<>();
    example.add(25);
    example.add(27);
    example.add(48);
    example.add(298);
    example.add(49583);
    System.out.println(example);
    addToEach(example, 10);
    System.out.println(example);
  }
}