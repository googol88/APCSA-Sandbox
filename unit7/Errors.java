class Errors {
  public static void main(String[] args) {
    ArrayList<Integer> unsorted = new ArrayList<>();
    unsorted.add(2000);
    unsorted.add(1000);
    unsorted.add(30);
    unsorted.add(1820);
    // results in concurrentModificationException from adding more items to an ArrayList in a for-each loop 
    for(int n: unsorted) {
      sorted.add(n);
    }
    // results in Heap error since it's caught in an infinite loop
    for(int i = 0; i < unsorted.size(); i++) {
      
    }

  }
}