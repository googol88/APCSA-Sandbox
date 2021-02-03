import java.util.ArrayList;

class RemoveAllOccurances {
  public static void removeAllOccurances(ArrayList<Integer> list, int valueToRemove) {
    for(int i = 0; i < list.size(); i++) {
      if(list.get(i) == valueToRemove) {
        list.remove(i);
        i--;
      }
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
    removeAllOccurances(example, 10);
    System.out.println(example);
  }
}