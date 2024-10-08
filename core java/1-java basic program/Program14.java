//find the sum of digits of the given number input by user.
import java.util.Scanner;
public class Program14 {
    int sum=0;
    //using recursion
    void sumOfDigits(int number){
        if(number != 0){
            sum=sum+number%10;
            number=number/10;
            sumOfDigits(number);
        }
    }
    //using while loop
    void sumOfDigits_using_While_loop(int number){
      while(number!=0){
        sum=sum+number%10;
        number=number/10;
      }
    }
    //using for loop
    void sumOfDisits_For_loop(int number){
      for(sum=0;number!=0;number=number/10){
        sum=sum+number%10;
      }
    }
    void show(){
        System.out.println("sum of digits :"+sum);
    }
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
        System.out.println("Enter any integer number:");
        int n=sc.nextInt();
        Program14 obj=new Program14();
        //obj.sumOfDigits(n);
        //obj.sumOfDigits_using_While_loop(n);
        obj.sumOfDisits_For_loop(n);
        obj.show();
      sc.close();  
    }
}
