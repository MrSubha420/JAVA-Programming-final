/* Custom type of ArrayList class*/
import java.util.*;
public class CustomArrayListExample {
  public static void main(String arr[]){
    List<Student> list= new ArrayList<>();
    list.add(new Student("subhadip", 0));
    list.add(new Student("sudip", 1));
    System.out.println(list);

  }  
}
