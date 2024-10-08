import java.util.*;
class primenum
{
    public static void main(String [] arg)
    {
        int n;
        try (Scanner sr = new Scanner(System.in)) {
            n = sr.nextInt();
            if(n==0 || n==1)
            {
                System.out.println("0 and 1 is not ...");
                return;
            }
            if(n==2)
            {
                System.out.println("This number is prime.");
                return;
            }
            for(int i=2;i<n/2+1;i++)
            {
                if(n%i == 0)
                {
                    System.out.println("The given number is not prime.");
                    return;
                }        
            }
            System.out.println("The given number is prime.");
            sr.close();
        }
    }
}