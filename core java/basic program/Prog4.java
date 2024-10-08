//input run time using Buffer Reader : InputStreamReader class
//simple input values and print the values.
import java.io.*;
public class Prog4 {
    public static void main(String arr[]) throws  IOException
    {
        InputStreamReader ir=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(ir);
        System.out.println("Enter the iteger value of a:");
        int a=Integer.parseInt(br.readLine());
        System.out.println("Enter the float value of b:");
        float b=Float.parseFloat(br.readLine());
        System.out.println("value of a="+a);
        System.out.println("value of b="+b);
    }
}
