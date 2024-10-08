//students grade using switch case
import java.util.Scanner;
public class Program17 {
    public static void main(String arr[]){
        System.out.println("Enter the obtained marks out of 100:");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        String grade;
        int score=num/10;
        switch(score){
            case 10:
                 grade="EX";
                 break;
            case 9:
                 grade="EX";
                 break;
            case 8:
                 grade="O";
                 break;
            case 7:
                grade="A";
                break;
            case 6:
                grade = "B";
                break;
            case 5:
                grade="c";
                break;
            default :
                grade="Fail";
                break;                 
        }
        System.out.printf("Basices of your obtain marks %d Grade is: %s",num,grade);
        sc.close();
    }
}
