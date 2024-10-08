// scanner class used input values at run time
// adding two numbers input values at run time
import java.util.*;
public class Prog3 {
    public static void main(String arr[])
    {
       int a,b,c;
       System.out.println("enter the value of a and b:");
       Scanner sc=new Scanner(System.in);
       a=sc.nextInt();
       b=sc.nextInt();
       c=a+b;
       System.out.println("total ="+c);
    }
}
