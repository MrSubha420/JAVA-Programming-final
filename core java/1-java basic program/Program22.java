//check the alphabet is vowel or consonent 
import java.util.Scanner;
public class Program22 {
   public static void main(String[] args) {
    while(true){
    Scanner sc=new Scanner(System.in);    
    System.out.println("Enter alphabet for checking vowel or consonent:");
    char alplabet=sc.next().charAt(0);
    if( alplabet == 'a' || alplabet=='e' || alplabet == 'i' || alplabet =='o' || alplabet=='u' || alplabet == 'A' || alplabet=='E' || alplabet == 'I' || alplabet =='O' || alplabet=='U' ){
        System.out.printf("\n %s is vowel \n",alplabet);
    }
    else{
        System.out.printf("\n %c is consonent \n",alplabet);
    }
   }
   } 
}

