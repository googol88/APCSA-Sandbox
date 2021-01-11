# U6L1: Introduction to Java Arrays

## The Student Class

**starter code:**  

```java
public class Student{
  // maximum number of grades in grade array
  public static final int MAX_GRADES = 7;
  // declare instance variables

  // constructor

  // instance methods

}
```
**TODO:**  
1. Declare the following 3 instance variables:
  * a String `name` to store the name of the Student.
  * an integer array called `grades` to store the student's grades.
  * an integer called `numGrades` that stores the number of grades entered for the student.
2. Write a constructor that does the following:
  * takes a String as a parameter and uses it to set the name of the student.
  * initializes the `grades` array, setting the size of the array to `MAX_GRADES`.
  * initializes `numGrades` to 0.
3. Write a method `addGrade()` that:
  * adds a new grade to `grades` only if there is room in the array.
  * if a grade is added, increment `numGrades`
  * if there is not room, print a message to console informing the user it didn't work.
4. Write a method `getGrade()` that:
  * takes an integer representing the position in the grade array to return.
  * return the grade if it is a valid index. (Valid index means a grade was specifically entered, defaulted '0's aren't valid)
  * return -1 if it is invalid.
6. Write a method called `improved()` that returns whether the last grade entered into the array is greater than the first grade entered. If no grades have been entered return `false`.
7. Write a method called `getGrades()` that returns a **copy** of the `grades` array. **Note:** do not return `grades` directly, or it will be mutable!
8. Write a `toString()` method that prints the student's name followed by a colon and the contents of the `grades` array.
  * It's okay to include the default 0's.
  * You may use `Arrays.toString()` to print the array.
  * Include an `@Override` tag.

## The Main Class

* Write enough test code to thoroughly check your code. For example, have one student who improves and one that does not. Try "overfilling" the grades array, or getting a grade at an invalid index, etc.

* Use `args` so that if an additional value is passed at the command line for example `java Main Spongebob`, the value passed will be used to create a student instance with that name `Student s = new Student("Spongebob");`