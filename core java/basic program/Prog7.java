// write a program in java example of simple if-else 
//checking the given number is odd or even
import java.util.*;
public class Prog7 {
    public static void main(String arr[])
    {
        int count=0;
        while(true){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:");
        int num=sc.nextInt();
        if(num % 2 == 0)
        {   
            count++;
            System.out.println("the given number is even number");
        }
        else 
        {
            count++;
            System.out.println("the given number is odd number");
        }
        if(count>=5)
        {
            break;
        }
    }
    }
    
}
