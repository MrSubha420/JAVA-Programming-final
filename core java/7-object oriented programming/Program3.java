//Example of user defined method.
import java.util.Scanner;
class Calculator{
    //This is all user defined methods sum(),substruct(),multiply(),division(),factorial(),modulo();
    //sum of two integer
    int sum(int num1,int num2){
        int sum=num1+num2;
        return sum;
    }
    //substruct of two number
    int substruct(int num1,int num2){
        int sub=num1-num2;
        return sub;
    }
    //multiply of two number
    int multiply(int num1,int num2){
        int mull=num1*num2;
        return mull;
    }
    //division of two number
    float division(int num1,int num2){
        float div=num1/num2;
        return div;
    }
    //modulo of two number
    int modulo(int num1,int num2){
        int modulo=num1%num2;
        return modulo;
    }
    //factorial of a number
    int factorial(int n){
        int fact=1;
        for(int i=1;i<=n;i++){
            fact=fact*i;
        }
        return fact;
    }
}
public class Program3 {
    public static void main(String[] args) {
        //creating object of calculator class
        Calculator ob1=new Calculator();
        Scanner sc =new Scanner(System.in);
        char op;
        System.out.println("+ for Addition \n - for Substruction \n * for multiplication \n / for division \n % fof modulo \n ! for factorial ");
        System.out.println("choose now :");
        op=sc.next().charAt(0);
        if(op == '+'){
            System.out.println("value of num1 and num2 :");
            int num1=sc.nextInt();
            int num2=sc.nextInt();
            System.out.println("summation ="+ob1.sum(num1, num2));
        }
        else if(op == '-'){
            System.out.println("value of num1 and num2 :");
            int num1=sc.nextInt();
            int num2=sc.nextInt();
            System.out.println("substruction ="+ob1.substruct(num1, num2));
        }
        else if(op == '*'){
            System.out.println("value of num1 and num2 :");
            int num1=sc.nextInt();
            int num2=sc.nextInt();
            System.out.println("Multiplayer total ="+ob1.multiply(num1, num2));
        }
        else if(op == '/'){
            System.out.println("value of num1 and num2 :");
            int num1=sc.nextInt();
            int num2=sc.nextInt();
            System.out.println("division ="+ob1.division(num1, num2));
        }
        else if(op == '%'){
            System.out.println("value of num1 and num2 :");
            int num1=sc.nextInt();
            int num2=sc.nextInt();
            System.out.println("Modulator ="+ob1.modulo(num1, num2));
        }
        else if(op == '!'){
            System.out.println("value of num1:");
            int num1=sc.nextInt();
            System.out.println("Factorial ="+ob1.factorial(num1));
        }
        else{
            System.out.println("error: enter valid operator");
        }
        sc.close();
    }
}
