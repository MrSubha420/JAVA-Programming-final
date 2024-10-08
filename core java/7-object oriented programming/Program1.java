/*
   


 */

//Simple class and object program 
import java.util.Scanner;
class Addition{
    int a;
    int b;
    public int add(int a1,int b1){
        a=a1;
        b=b1;
        int sum =a+b;
        return sum;
    }
}
class Program1{
    public static void main(String[] args) {
        // creating object of Addition class
        Addition ob1=new Addition();
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the value of x:");
        int x=sc.nextInt();
        System.out.println("enter the value of x:");
        int y=sc.nextInt();
        int sum1=ob1.add(x,y);
        System.out.println("total="+sum1);
        sc.close();
    }
}