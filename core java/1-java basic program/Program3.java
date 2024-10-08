//Write a java program example of all the arithmetic operator.
import java.util.Scanner;
 class ExampleOfArithmeticOperator{
    int Addition(int a,int b){
        int c=a+b;
        return c;
    }
    int Substract(int a,int b){
        int c=a-b;
        return c;
    }
    int Multiplication(int a,int b){
        int c=a*b;
        return c;
    }
    float Division(int a,int b){
        int c=a/b;
        return c;
    }
    int Modulo(int a,int b){
        int c=a%b;
        return c;
    }

}
public class Program3 {
    public static void main(String[] args) {
        int c,d;
        System.out.println("enter the value of c&d:");
         try (Scanner sc = new Scanner(System.in)) {
            c=sc.nextInt();
            d=sc.nextInt();
        }
            ExampleOfArithmeticOperator obj = new ExampleOfArithmeticOperator();
     System.out.println("Addition total ="+obj.Addition(c,d));
     System.out.println("substruction total ="+obj.Substract(c,d));
     System.out.println("multiplication total ="+obj.Multiplication(c,d));
     System.out.println("division total ="+obj.Division(c,d));
     System.out.println("modulo total ="+obj.Modulo(c,d));
    }
}
