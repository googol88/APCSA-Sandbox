import java.util.Arrays;

public class Student{

  public static final int MAX_GRADES = 7;

  // declare instance variables
  String name;
  int[] grades;
  int numGrades;
  // constructor
  public Student(String name) {
    this.name = name;
    grades = new int[MAX_GRADES];
    numGrades = 0;
  }
  // instance methods
  public void addGrade(int grade) {
    if (numGrades < grades.length) {
      grades[numGrades] = grade;
      numGrades++;
    }
    else {
      System.out.println("Error: not enough room");
    }
  }
  public int getGrade(int index) {
    if (index >= 0 && index < numGrades) {
      return grades[index];
    }
    return -1;
  }
  public boolean improved() {
    if (numGrades == 0)
      return false;
    return grades[numGrades-1] > grades[0];
  }
  public int[] getGrades() {
    return grades.clone();
  }
  @Override
  public String toString() {
    String strGrades = "";
    for(int grade : grades) {
      strGrades += " "+grade;
    }
    return name+":"+strGrades;
  }
}