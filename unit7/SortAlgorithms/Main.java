import java.util.ArrayList;
import java.util.Collections;
 
class Main {
 public static ArrayList<Integer> generateRandomList(int size, int min, int max) {
   ArrayList<Integer> randomList = new ArrayList<>();
   for (int i = 0; i < size; i++) {
     randomList.add((int) (Math.random() * (max - min + 1) + min));
   }
   return randomList;
 }
 
 public static void selectionSort(ArrayList<Integer> list) {
   for (int i = 0; i < list.size() - 1; i++) {
     int minIndex = i;
     for (int j = i + 1; j < list.size(); j++) {
       if (list.get(j) < list.get(minIndex)) {
         minIndex = j;
       }
     }
     int temp = list.get(i);
     list.set(i, list.get(minIndex));
     list.set(minIndex, temp);
   }
 
 }
 
 public static void insertionSort(ArrayList<Integer> list) {
   for (int i = 1; i < list.size(); i++) {
     int insertIndex = i - 1;
     while (insertIndex >=0 &&list.get(i) < list.get(insertIndex)) {
       insertIndex--;
     }
     int removed = list.remove(i);
     list.add(insertIndex+1, removed);
   }
 }
 
 public static void testSorts(int size){
   long start, stop;
   ArrayList<Integer> sList = generateRandomList(size, -100, 100);
   ArrayList<Integer> iList = new ArrayList<>(sList);
   ArrayList<Integer> cList = new ArrayList<>(sList);
   System.out.println("\nStarting Data:");
   System.out.println(sList);
   System.out.println(iList);
   System.out.println(cList+"\n");
   start = System.nanoTime();
   selectionSort(sList);
   stop = System.nanoTime();
   System.out.println("S-sort completed in " + (stop-start)/(Math.pow(10, 9)) + "s");
   start = System.nanoTime();
   insertionSort(iList);
   stop = System.nanoTime();
   System.out.println("I-sort completed in " + (stop-start)/(Math.pow(10, 9)) + "s");
   start = System.nanoTime();
   Collections.sort(cList);
   stop = System.nanoTime();
   System.out.println("C-sort completed in " + (stop-start)/(Math.pow(10, 9)) + "s");
   System.out.println("\nEnding Data:");
   if(size <= 100){
     System.out.println(sList);
     System.out.println(iList);
     System.out.println(cList+"\n");
   } else{
     ArrayList<Integer> sMini = new ArrayList<>();
     ArrayList<Integer> iMini = new ArrayList<>();
     ArrayList<Integer> cMini = new ArrayList<>();
     for(int i = 0; i < 10; i++){
       sMini.add(sList.get(i));
       iMini.add(iList.get(i));
       cMini.add(cList.get(i));
     }
     System.out.println(sMini+"...");
     System.out.println(iMini+"...");
     System.out.println(cMini+"...\n");
   }
 }
 
 public static void main(String[] args) {
   testSorts(200);
   // from 10,000 to 100,000 --> S-sort * 100, I-sort * 10
 }
}


