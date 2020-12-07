class Main {
  public static void main(String[] args) {
    Student bob = new Student("Bob", 123456);
    Student alice = new Student("Alice", 123457);
    System.out.println(bob.getGpa());
    System.out.println(Student.getStudentTotal());
  }
}