class Main {
  public static void main(String[] args) {
    Course apcsa = new Course("AP Computer Science A");

    System.out.println(" -------- \n| Shaggy |\n -------- ");
    Student shaggy = new Student("Shaggy");
    apcsa.addStudent(shaggy);
    shaggy.addGrade(29);
    shaggy.addGrade(83);
    shaggy.addGrade(71);
    shaggy.addGrade(49);
    shaggy.addGrade(62);
    shaggy.addGrade(49);
    System.out.println("Average: "+shaggy.calculateAverage());
    System.out.println("Improved?: "+shaggy.improved());

    System.out.println(" -------- \n| Scooby |\n -------- ");
    Student scooby = new Student("Scooby");
    apcsa.addStudent(scooby);
    scooby.addGrade(73);
    scooby.addGrade(95);
    scooby.addGrade(71);
    scooby.addGrade(74);
    scooby.addGrade(95);
    System.out.println("Average: "+scooby.calculateAverage());
    System.out.println("Improved?: "+scooby.improved());
    
    System.out.println(" ------- \n| Velma |\n ------- ");
    Student velma = new Student("Velma");
    apcsa.addStudent(velma);
    velma.addGrade(27);
    velma.addGrade(36);
    velma.addGrade(46);
    velma.addGrade(59);
    velma.addGrade(26);
    velma.addGrade(16);
    System.out.println("Average: "+velma.calculateAverage());
    System.out.println("Improved?: "+velma.improved());

    System.out.println("\n");
    System.out.println("# improved: "+apcsa.getNumImproved());
    System.out.println("Highest average: "+apcsa.getMaxAverage());
    System.out.println("Lowest average: "+apcsa.getMinAverage());
    System.out.println();
    apcsa.printRoster();
  }
}