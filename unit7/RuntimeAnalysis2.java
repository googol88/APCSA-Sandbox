import java.util.ArrayList;
import java.util.Collections;

class RuntimeAnalysis2 {

  private static ArrayList<Long> sortTimes = new ArrayList<>();
  private static ArrayList<Long> linearTimes = new ArrayList<>();
  private static ArrayList<Long> binaryTimes = new ArrayList<>();
  private static ArrayList<Integer> numbers = new ArrayList<>();

  public static ArrayList<Integer> generateRandomList(int size, int min, int max) {
    /*
     * write a method that randomly populates a list with `size` elements with
     * integers between `min` and `max` inclusive.
     */
    ArrayList<Integer> randomList = new ArrayList<>();
    for (int i = 0; i < size; i++) {
      randomList.add((int) (Math.random() * (max - min + 1) + min));
    }
    return randomList;
  }

  public static double median(ArrayList<Long> list) {
    /*
     * write a method that takes a list of longs (64 bit integers) and returns the
     * median. NOTE: median of an even set is the mean of the 2 center values.
     * Preserve the original order (clone before sorting)
     */
    ArrayList<Long> copy = new ArrayList<>(list);
    Collections.sort(copy);
    int midIndex = copy.size() / 2;
    if (copy.size() % 2 == 0) {
      return (copy.get(midIndex - 1) + copy.get(midIndex)) / 2.0;
    } else {
      return copy.get(midIndex);
    }
  }

  public static long min(ArrayList<Long> list) {
    /* return the min value of the list - preserve original order */
    long minValue = list.get(0);
    for (int i = 1; i < list.size(); i++) {
      if (list.get(i) < minValue) {
        minValue = list.get(i);
      }
    }
    return minValue;
  }

  public static long max(ArrayList<Long> list) {
    /* return the max value of the list - preserve original order */
    long maxValue = list.get(0);
    for (int i = 1; i < list.size(); i++) {
      if (list.get(i) > maxValue) {
        maxValue = list.get(i);
      }
    }
    return maxValue;
  }

  public static double q1(ArrayList<Long> list) {
    /*
     * return the first quartile of the list. The first quartile is the median of
     * the lower half - preserve original order
     */
    ArrayList<Long> copy = new ArrayList<>(list);
    Collections.sort(copy);
    ArrayList<Long> leftHalf = new ArrayList<>();
    for (int i = 0; i < list.size() / 2; i++) {
      leftHalf.add(copy.get(i));
    }
    return median(leftHalf);
  }

  public static double q3(ArrayList<Long> list) {
    /* return the third quartile of the list - preserve original order */
    ArrayList<Long> copy = new ArrayList<>(list);
    Collections.sort(copy);
    ArrayList<Long> rightHalf = new ArrayList<>();
    int startIndex = list.size() % 2 == 0 ? list.size() / 2 : list.size() / 2 + 1;
    for (int i = startIndex; i < list.size(); i++) {
      rightHalf.add(copy.get(i));
    }
    return median(rightHalf);
  }

  public static int linearSearch(ArrayList<Integer> list, int searchVal) {
    for (int i = 0; i < list.size(); i++) {
      if (list.get(i) == searchVal) {
        return i;
      }
    }
    return -1;
  }

  public static int binarySearch(ArrayList<Integer> list, int searchVal) {
    int lo = 0;
    int hi = list.size() - 1;
    while (lo <= hi) {
      int mid = (lo + hi) / 2;
      int midVal = list.get(mid);
      if (midVal == searchVal) {
        return mid;
      } else if (midVal < searchVal) {
        lo = mid + 1;
      } else {
        hi = mid - 1;
      }
    }
    return -1;
  }

  public static void printSummary(ArrayList<Long> list) {
    System.out.println("Size: " + list.size());
    System.out.println("Min: " + min(list));
    System.out.println("Q1: " + q1(list));
    System.out.println("Median: " + median(list));
    System.out.println("Q3: " + q3(list));
    System.out.println("Max: " + max(list) + "\n");
  }

  public static void main(String[] args) {
    int size = 10000;
    // linear
    /*for (int i = 0; i < 30; i++) {
      numbers = generateRandomList(size, 1, size);
      for (int j = 1; j <= size; j++) {
        long startTime = System.nanoTime();
        linearSearch(numbers, j);
        long endTime = System.nanoTime();
        linearTimes.add(endTime - startTime);
      }
    }
    printSummary(linearTimes);*/

    // binary
    /*for (int i = 0; i < 30; i++) {
      numbers = generateRandomList(size, 1, size);
      Collections.sort(numbers);
      for (int j = 1; j <= size; j++) {
        long startTime = System.nanoTime();
        binarySearch(numbers, j);
        long endTime = System.nanoTime();
        binaryTimes.add(endTime - startTime);
      }
    }
    printSummary(binaryTimes);*/

    // sort
    for (int i = 0; i < 30*size; i++) {
      numbers = generateRandomList(size, 1, size);
      long startTime = System.nanoTime();
      Collections.sort(numbers);
      long endTime = System.nanoTime();
      sortTimes.add(endTime - startTime);
    }
    printSummary(sortTimes);
  }
}