public class Person
{
   private String name;

   public Person(String theName)
   {
      this.name = theName;
   }

   /** Overriden equals method that checks if names are equal
       in this Person object and an the other Object.
       */
   @Override
    public boolean equals(Object other)
   {
      if(other instanceof Person) {
          // Type cast other to a Person
          Person otherPerson = (Person) other;
          // Check if names are equal
          return this.name.equals(otherPerson.name);
      }
      // if it's not person they're not equal
      return false;
   }

   public static void main(String[] args)
   {
      Person p1 = new Person("Gabe");
      Person p2 = new Person("Gus");
      Person p3 = new Person("Gabe");
      Person p4 = p3;
      String p5 = "Gary";
      System.out.println(p1.equals(p2));
      System.out.println(p2.equals(p3));
      System.out.println(p1.equals(p3));
      System.out.println(p3.equals(p4));
      System.out.prinln(p1.equals(p5)); 
   }
}
