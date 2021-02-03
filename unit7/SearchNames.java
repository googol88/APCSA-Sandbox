import java.util.ArrayList;

class SearchNames {
  public static int linearIterations(ArrayList<String> list, String searchVal) {
    int iterations = 0;
    for(int i = 0; i < list.size(); i++) {
      iterations++;
      if(searchVal.equals(list.get(i))) {
        return iterations;
      }
    }
    return -1; // not found
  }

  // precondition: list is sorted in ascending order
  public static int binaryIterations(ArrayList<String> list, String searchVal) {
    int hi = list.size()-1;
    int lo = 0;
    int mid = (hi + lo)/2;

    int iterations = 0;

    while(lo <= hi) {
      iterations++;
      if(searchVal.equals(list.get(mid))) {
        return iterations;
      } else if(list.get(mid).compareTo(searchVal) < 0) { // mid value is smaller
        lo = mid + 1;
      } else { // mid value is larger
        hi = mid - 1;
      }
      mid = (hi + lo)/2;
    }
    return -1;
  }
  public static void main(String[] args) {
    ArrayList<String> list = new ArrayList<>();

    /*list.add("Alisha");
    list.add("Amber");
    list.add("Ben");
    list.add("Brian");
    list.add("CJ");
    list.add("Megan");
    list.add("Nora");
    list.add("Ryan B");
    list.add("Ryan P");
    list.add("Sanjay");
    list.add("Tyler");
    list.add("Wesley");*/

    list.add("Elli");
    list.add("Andrew");
    list.add("Katie");
    list.add("Frank");
    list.add("Jonathan");
    list.add("Chase");
    list.add("Charlie");
    list.add("Brian");
    list.add("Emily");
    list.add("Sameer");


    for (String name : list) {
      System.out.println(linearIterations(list, name));
    }
    System.out.println();
    for (String name : list) {
      System.out.println(binaryIterations(list, name));
    }

  }
}