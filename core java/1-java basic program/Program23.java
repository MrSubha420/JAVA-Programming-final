// checking the number is odd or even
import java.util.Scanner; 
public class Program23 {
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in); 
      System.out.println("Enter the number");
      int n=sc.nextInt();
      if (n%2==0){
        System.out.println("the number is even");
      } 
      else{
        System.out.println("The number is odd");
      }
      sc.close();
    }
}
