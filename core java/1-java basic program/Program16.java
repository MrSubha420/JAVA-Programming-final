//check the year is leapyear or not
import java.util.Scanner;
public class Program16{
  void checkLeapYear(int year){
    if((year%4 ==0)&&((year%400 ==0)||(year%100 != 0)) ){
        System.out.printf("%d given year is leapyear",year);
    }
    else{
        System.out.printf("%d given year is not leapyear",year);  
    }
  } 
  public static void main(String[] args) {
    Program16 ob=new Program16();
   Scanner sc =new Scanner(System.in) ;
   System.out.println("Enter the year for chicking:");
   int y=sc.nextInt();
    ob.checkLeapYear(y);
   sc.close();
  } 
}
