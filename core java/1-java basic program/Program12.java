//find the g.c.d of two integer.
import java.util.Scanner;
 class Program12 {
    // using for loop
    void findGCD_for_loop(int n1,int n2){
        int gcd=1;
        for(int i=1;i<=n1 && i<=n2;i++){
            if(n1%i==0 && n2%i==0){
                gcd=i;
            }
        }
        System.out.printf("GCD of %d and %d is: %d",n1,n2,gcd);
    }
    // using while loop
    void findGCD_while_loop(int n1,int n2){
        int num1=n1;
        int num2=n2;
        while(n1 != n2){
            if(n1>n2){
                n1=n1-n2;
            }
            else {
                n2=n2-n1;
            }
        }
        System.out.printf("GCD of %d and %d is: %d",num1,num2,n2);
    }
    //using recursion 
     int findGCD(int n1,int n2){
        if(n2==0){
            System.out.println("GCD is:"+n1);
            return n1;
        }
        int gcd=findGCD(n2,n1%n2);
        System.out.println("gcd="+gcd);
        return gcd;
    }

    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter the value of x & y :");
       int x=sc.nextInt();
       int y=sc.nextInt();
       Program12 obj=new Program12(); 
       //obj.findGCD_for_loop(x, y);
       //obj.findGCD_while_loop(x, y); 
       obj.findGCD(x, y);
       sc.close();
    }
    
}
