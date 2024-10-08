//Association in java
//Aggreation in java
//one to one relationship Hass-A association is called aggration.
//It is a unidirectional association i.e. a one-way relationship.
// For example, a department can have students but vice versa is not possible and thus unidirectional in nature.
//class 1
//Student class
import java.util.*;
class Student3{
    String name;
    int Id;
    String Dept;
    Student3(String name,int Id,String Dept){
        this.name=name;
        this.Id=Id;
        this.Dept=Dept;
    }

}
// Class 2
// Department class contains list of student objects
// It is associated with student class through its Objects
class Department{
    String name;
    List<Student3> student3s;
    Department(String name,List<Student3> student3s){
        this.name=name;
        this.student3s=student3s;
    }
    List<Student3> getStudent3s(){
        return student3s;
    }
}
// Class 3
//  Institute class contains list of Department
// Objects. It is associated with Department
// class through its Objects
class Institute{
    String name;
    List<Department> departments;
    Institute(String name,List<Department> departments){
        this.name=name;
        this.departments=departments;
    }
    String instituteName(){
        return name;
    }
    // Counting total students of all departments
    int totalStudents(){
        int total=0;
         List<Student3> students;
        for (Department dept : departments) {
             students = dept.getStudent3s();
            for (Student3 student : students) {
               total++;
            }
        }
        return total ;
    }
}
public class Program26 {
    public static void main(String[] args) {
          // Creating object of Student class inside main()
          Student3 s1 = new Student3("Mia", 1, "CSE");
          Student3 s2 = new Student3("Priya", 2, "CSE");
          Student3 s3 = new Student3("John", 1, "EE");
          Student3 s4 = new Student3("Rahul", 2, "EE");
           // Creating a List of CSE Students
        List<Student3> cse_students = new ArrayList<Student3>();
 
        // Adding CSE students
        cse_students.add(s1);
        cse_students.add(s2);
 
        // Creating a List of EE Students
        List<Student3> ece_students= new ArrayList<Student3>();
 
        // Adding EE students
        ece_students.add(s3);
        ece_students.add(s4);

        //creating Department
        Department dept1=new Department("C.S.E", cse_students);
        Department dept2=new Department("E.C.E", ece_students);

        //Creating list of depertment List
        List<Department> departments=new ArrayList<Department>();
        departments.add(dept1);
        departments.add(dept2);
        //Creating institute.
        Institute institute=new Institute("M.S.I.T", departments);
        System.out.println("In "+institute.instituteName()+" total numbers of students is "+institute.totalStudents());

    }
}
