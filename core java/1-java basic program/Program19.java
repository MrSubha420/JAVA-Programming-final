//calculate simple interest.
//i=(p*T*R)/100 , i is interest ,p total capital , t is time year wise , r is persent of interest
import java.util.Scanner;
public class Program19 {
    public static void main(String[] args) {
        // input capital , time , persentage of interest
        Scanner sc=new Scanner(System.in);
        String chose;
        String year="y";
        String mounth="m";
        double capital;
        double time;
        double interest=0.0;
        double persentage;
        System.out.println("choose yearly calculate press: y");
        System.out.println("choose yearly calculate press: m");
        System.out.println("Enter your choise:");
        chose=sc.nextLine();
        System.out.println("Enter total capital:");
        capital=sc.nextDouble();
        System.out.println("Enter time:");
        time=sc.nextDouble();
        System.out.println("Enter persentage of interest:");
        persentage=sc.nextDouble();
        if(chose.equals(year)){
            interest=(capital*time*persentage)/100;
        }
        else if(chose.equals(mounth)){
            interest=(capital*(time/12)*persentage)/100;
        }
        else{
            System.out.println("please chose correct word y/m");
        }
        System.out.println(" calculated interest is ="+interest);
        sc.close();
    }
}
