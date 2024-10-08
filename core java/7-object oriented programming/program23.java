// Example of association in java
/* 
in the above example, we create two separate classes, i.e.,
 Person and Mobile, associated through their objects. 
 A person can have many mobile numbers, so it defines the one-to-many relationship.
*/
import java.util.*;
class Mobile{
    String mob_no;
    public void setMobile(String mob_no){
        this.mob_no=mob_no;
    }
     @Override
    public String toString() {
        return String.valueOf(mob_no);
}
}
class Person {
    String name;
    List<Mobile> numbers;
    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }
    public void setNumbers(List<Mobile> numbers){
        this.numbers=numbers;
    }
    public List<Mobile> getNumbers(){
       return numbers;
    }
}
public class program23 {
    public static void main(String[] args) {
       Person p1=new Person();
       p1.setName("Subhadip Manna");
       Mobile number1=new Mobile();
       number1.setMobile("9641244688");
       Mobile number2=new Mobile();
       number2.setMobile("9800209087");
       List<Mobile> numbers=new ArrayList<>();
       p1.setNumbers(numbers);
       numbers.add(number1);
       numbers.add(number2); 
       System.out.println("your name is :"+p1.getName());
       System.out.println("your mobile numbers is:"+p1.getNumbers());  
    }
}
