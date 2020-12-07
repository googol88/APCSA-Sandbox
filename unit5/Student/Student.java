public class Student {
  // statics
  public static final int MAX_STUDENTS = 30;
  private static int studentTotal;
  
  // instance
  private int studentId;
  private String name;
  private int gradeLevel;
  private double gpa;
  private boolean activeStudent;

  public Student(String name, int studentId) {
    this.name = name;
    this.studentId = studentId;
    this.gradeLevel = 9;
    this.gpa = 4.0;
    studentTotal++; // don't use this for statics
    this.activeStudent = (studentTotal <= MAX_STUDENTS);
  }

  public double getGpa() {
    return this.gpa;
  }

  public static int getStudentTotal() {
    return studentTotal; // don't use this for statics
  }

  // setters
  public void setGradeLevel(int gradeLevel) {
    this.gradeLevel = gradeLevel;
  }

  public void setGpa(double gpa) {
    if (gpa >= 0 && gpa <= 4.0) {
      this.gpa = gpa;
    } else {
      System.out.println("Invalid GPA");
    }
  }
}