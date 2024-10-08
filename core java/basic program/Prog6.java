// command line argument example 
import java.lang.ArrayIndexOutOfBoundsException;
public class Prog6 {
  public static void main(String arr[]) throws ArrayIndexOutOfBoundsException{
    System.out.println("Argument list are printed:");
    for(int i=0;i<=arr.length;i++)
    {
        System.out.println(arr[i]);
    }
  }  
}
