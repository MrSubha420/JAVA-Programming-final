//Example of constructer
import java.util.Scanner;
class Student{
    String name;
    int roll;
    //this is constructer 
    Student(String name,int roll){
        this.name=name;
        this.roll=roll;
    }
    void display(){
        System.out.println("Your name is: "+name);
        System.out.println("Roll no is: "+roll);
    }
}
public class Program2 {
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      System.out.println(  "Enter your name:" );
      String name1=sc.next();
      System.out.println("Enter your roll no:");
      int roll1=sc.nextInt();
      Student s1= new Student(name1, roll1);
      s1.display();
      sc.close(); 
    }
}
