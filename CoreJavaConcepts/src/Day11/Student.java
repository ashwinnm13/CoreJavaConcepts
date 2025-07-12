//this program is to demonstrate final keyword in java
package Day11;

public class Student 
{
 private String name;
 private String department;
 
 private University university = new University();

 public Student(String name, String department) {
     this.name = name;
     this.department = department;
 }

 public void displayStudentDetails() {
     System.out.println("Student Name: " + name);
     System.out.println("Department: " + department);
     university.displayUniversity();
     
    // Final assigned variable , methods or classes can't be reassigned ...
   //  university.univ_name = "National Institute of Technology";
 }
}
