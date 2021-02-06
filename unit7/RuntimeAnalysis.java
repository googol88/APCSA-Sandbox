import java.util.ArrayList;
import java.util.Collections;

class RuntimeAnalysis {

  public static ArrayList<Integer> generateRandomList(int size, int min, int max){
    /* write a method that randomly populates a list with `size` elements with integers between `min` and `max` inclusive. */
    ArrayList<Integer> list = new ArrayList<>();
    for(int i = 0; i < size; i++) {
      list.add((int) (Math.random()*(max-min+1)+min));
    }
    return list;
  }

  public static double median(ArrayList<Long> runtimes){
    /* write a method that takes a list of longs (64 bit integers) and returns the median. NOTE: median of an even set is the mean of the 2 center values. Preserve the original order (clone before sorting)*/
    ArrayList<Long> sorted = new ArrayList<>();
    sorted = (ArrayList)runtimes.clone();
    Collections.sort(sorted);
    return (sorted.size()%2 == 0
      ? (sorted.get(sorted.size()/2) + sorted.get(sorted.size()/2-1)) / 2.0
      : sorted.get(sorted.size()/2)
    );
  }

  public static long min(ArrayList<Long> list){
    /* return the min value of the list - preserve original order */
    long min = Integer.MAX_VALUE;
    for(long l : list) {
      if (l < min)
        min = l;
    }
    return min;
  }

  public static long max(ArrayList<Long> list){
    /* return the max value of the list - preserve original order */
    long max = Integer.MIN_VALUE;
    for(long l : list) {
      if (l > max)
        max = l;
    }
    return max;
  }

  public static double q1(ArrayList<Long> list){
    // NOTE: method return type changed from `long` to `double` due to possibility of q1 being non-integer
    /* return the first quartile of the list. The first quartile is the median of the lower half - preserve original order */
    ArrayList<Long> sorted = new ArrayList<>();
    sorted = (ArrayList)list.clone();
    Collections.sort(sorted);
    if ((sorted.size()/2)%2 == 0) {
      return (
        sorted.get(sorted.size()/4) + 
        sorted.get(sorted.size()/4-1)
      ) / 2.0;
    }
    return sorted.get(sorted.size()/4);
  }

  public static double q3(ArrayList<Long> list){
    // NOTE: method return type changed from `long` to `double` due to possibility of q3 being non-integer
    /* return the third quartile of the list - preserve original order */
    ArrayList<Long> sorted = new ArrayList<>();
    sorted = (ArrayList)list.clone();
    Collections.sort(sorted);
    if ((sorted.size()/2)%2 == 0) {
      return (
        sorted.get(sorted.size()-sorted.size()/4) + 
        sorted.get(sorted.size()-sorted.size()/4-1)
      ) / 2.0;
    }
    return sorted.get(sorted.size()-sorted.size()/4);
  }

  public static int linearSearch(ArrayList<Integer> list, int searchVal){
    for(int i = 0; i < list.size(); i++){
      if(list.get(i) == searchVal){
        return i;
      }
    }
    return -1;
  }

  public static int binarySearch(ArrayList<Integer> list, int searchVal){
    int lo = 0;
    int hi = list.size()-1;
    while(lo <= hi){
      int mid = (lo + hi)/2;
      int midVal = list.get(mid);
      if(midVal == searchVal){
        return mid;
      } else if(midVal < searchVal){
        lo = mid + 1;
      } else{
        hi = mid - 1;
      }
    }
    return -1;
  }
  
  public static void main(String[] args) {
    // Precondition: length of ArrayList is at least 4
    ArrayList<Integer> list = new ArrayList<>();
    list = generateRandomList(5, -61, 37);
    
    ArrayList<Long> longList = new ArrayList<>();
    for (int i : list) {
      longList.add((long) i);
    }

    ArrayList<Long> sorted = new ArrayList<>();
    sorted = (ArrayList)list.clone();
    Collections.sort(sorted);
    
    
    System.out.println("Original List: " + longList);
    System.out.println("Sorted List:   " + sorted + "\n");
    System.out.println("Min: " + min(longList));
    System.out.println("Q1:  " + q1(longList));
    System.out.println("Q2:  " + median(longList));
    System.out.println("Q3:  " + q3(longList));
    System.out.println("Max: " + max(longList));

  }
}