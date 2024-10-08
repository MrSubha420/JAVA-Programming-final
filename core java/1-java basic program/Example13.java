//find LCM of two integer number 
import java.util.Scanner;
public class Example13 {
    // uing for loop
    void findLCM_for_loop(int n1,int n2){
        int gcd=0,lcm=0;
        for(int i=1;i<=n1 && i<=n2;i++){
            if(n1%i == 0 && n2%i==0){
                gcd=i;
            }
        }
        lcm=(n1*n2)/gcd;
        System.out.printf("lcm of %d , %d is %d",n1,n2,lcm);
    }
    public static void main(String[] args) {
       Example13 obj=new Example13();
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter the alue of x & Y:");
       int x=sc.nextInt();
       int y=sc.nextInt();
       obj.findLCM_for_loop(x, y);
       sc.close(); 
    }
}
