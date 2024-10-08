//Find the average of 1 to n integer number.
import java.util.Scanner;
public class Program9 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("enter the value of n:");
            int n=sc.nextInt();
            float avg;
            int sum=0;
            int i;
            for(i=1;i<n;i++){
                sum=sum+i;
            }
            avg=sum/n;
            System.out.println("Average of 1 to "+n+" integer number is "+avg);
        }
    }
}
