
class Main {
  public static void main(String[] args) {
    // test the Student class here
    Student dan = new Student("Dan");
    System.out.println(dan.toString());
    dan.addGrade(42);
    dan.addGrade(51);
    dan.addGrade(39);
    dan.addGrade(47);
    System.out.println(dan.toString());
    System.out.println(dan.getGrade(0));
    System.out.println(dan.getGrade(4));
    dan.addGrade(78);
    dan.addGrade(82);
    dan.addGrade(69);
    System.out.println(dan.toString());
    dan.addGrade(100);
    dan.addGrade(273);
    System.out.println(dan.toString());
    System.out.println(dan.improved());
    System.out.println();

    Student lam = new Student("Lam");
    System.out.println(lam.toString());
    lam.addGrade(83);
    lam.addGrade(94);
    lam.addGrade(97);;
    System.out.println(lam.toString());
    System.out.println(lam.getGrade(2));
    System.out.println(lam.getGrade(-2));
    lam.addGrade(74);
    lam.addGrade(49);
    lam.addGrade(28);
    lam.addGrade(39);
    System.out.println(lam.toString());
    lam.addGrade(100);
    System.out.println(lam.toString());
    System.out.println(lam.improved());
    System.out.println();

    if (args != null && args.length != 0) {
      Student son = new Student(args[0]);
      System.out.println(son.toString());
      System.out.println(son.improved());
      System.out.println(son.getGrade(0));
    }
  }
}