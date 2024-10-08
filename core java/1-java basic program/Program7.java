//Example of Switch-Case.
import java.util.Scanner;
public class Program7 {
   public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)) {
        System.out.println("choose case: ");
        int n=sc.nextInt();
        switch(n ){
            case 1: 
                System.out.println("this is case 1");
                 break;
            case 2:
                System.out.println("this is case 2");
                break;
            case 3:
                System.out.println("this is case 3");
                break;
            default :
                System.out.println("this is default case");            
        }
    }
   } 
}
