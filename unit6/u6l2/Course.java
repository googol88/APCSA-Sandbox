public class Course{
  // max array size
  public static final int MAX_STUDENTS = 30;
  // instance variables
  private String name;
  private int numStudents;
  private Student[] students;

  // write constructor here
  public Course(String name) {
    this.name = name;
    students = new Student[MAX_STUDENTS];
    numStudents = 0;
  }
  // write instance methods here
  public void addStudent(Student student) {
    if (numStudents < students.length) {
      students[numStudents] = student;
      numStudents++;
    }
    else {
      System.out.println("Error: not enough room");
    }
  }
  public int getNumImproved() {
    int numImproved = 0;
    for (Student student : students) {
      if (student != null && student.improved())
        numImproved++;
    }
    return numImproved;
  }
  public double getMaxAverage() {
    double max = students[0].calculateAverage();
    for (Student student : students) {
      if (student != null && student.calculateAverage() > max)
        max = student.calculateAverage();
    }
    return max;
  }
  public double getMinAverage() {
    double min = students[0].calculateAverage();
    for (Student student : students) {
      if (student != null && student.calculateAverage() < min)
        min = student.calculateAverage();
    }
    return min;
  }
  public void printRoster() {
    System.out.println("Roster for "+name);
    int index = 0;
    for (Student student: students) {
      if (student != null) {
        System.out.println(
          (index++)+". "+
          student.getName()+" "+
          student.calculateAverage()
        );
      }
    }
  }
}