import java.util.ArrayList;

class SearchAlgorithms {
  public static int linearSearch(ArrayList<Integer> list, int searchVal) {
    for(int i = 0; i < list.size(); i++) {
      if(searchVal == list.get(i)) {
        return i;
      }
    }
    return -1; // not found
  }

  // precondition: listt is sorted in ascending order
  public static int binarySearch(ArrayList<Integer> list, int searchVal) {
    int hi = list.size()-1;
    int lo = 0;
    int mid = (hi + lo)/2;

    while(lo <= hi) {
      if(list.get(mid) == searchVal) {
        return mid;
      } else if(list.get(mid) < searchVal) {
        lo = mid + 1;
      } else { // mid value is larger
        hi = mid - 1;
      }
      mid = (hi + lo)/2;
    }
    return -1;
  }
  public static void main(String[] args) {
    ArrayList<Integer> list = new ArrayList<>();
    list.add(-20);
    list.add(15);
    list.add(102);
    list.add(151);
    list.add(167);
    System.out.println(linearSearch(list, 15));
    System.out.println(linearSearch(list, -20));
    System.out.println(linearSearch(list, 0));
    System.out.println(binarySearch(list, 15));
    System.out.println(binarySearch(list, -20));
    System.out.println(binarySearch(list, 0));

  }
}