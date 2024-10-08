//calculate compund interest.
/*
Compound interest can be calculated using the following formula:

A = P(1 + r/n)^(nt)

Where:

A is the future value of the investment/loan, including interest.
P is the principal amount (initial investment/loan).
r is the annual interest rate (in decimal form).
n is the number of times that interest is compounded per year.
t is the number of years the money is invested/borrowed.
To calculate the compound interest itself, you can subtract the principal amount from the future value:

Compound Interest = A - P 


 */
import java.util.Scanner;
public class Program20 {
    double calculate_compound_Interest(double p,double r,double n,double t){
        double rate=r/100;//beacuse it calculate persentage per annual.
        double a=p*Math.pow((1+(rate/n)),(n*t));
        double ci=a-p;
        return ci;
    }
    public static void main(String[] args) {
      Program20 obj=new Program20();
      Scanner sc=new Scanner(System.in);
      double p,n,r,t;
      //principle
      System.out.println("Enter total principle:");
      p=sc.nextDouble();
      //time
      System.out.println("Enter total time per year:");
      t=sc.nextDouble();
      //percentage of interest
      System.out.println("Enter percentage per interest:");
      r=sc.nextDouble();
      //number of times that interest is compounded per year.
      System.out.println("Enter number of times that interest is compounded per year:");
      n=sc.nextDouble();
      double compound_Interest=obj.calculate_compound_Interest(p, r, n, t);
      System.out.println("Total inrest is:"+compound_Interest);
      sc.close();  
    }
}
