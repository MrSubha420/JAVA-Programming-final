//Finding largest number in between three integer 
//Example of nested if-else
public class Prog8 {
    public static void main(String arr[])
    {
        int a=78,b=45,c=30;
        if(a>b){
            if(a>c)
            {
                System.out.println("the largest number is:"+a);
            }
            else{
                System.out.println("the largest number is:"+c);
            }
        }
        else{
            if(b>c)
            {
                System.out.println("the largest number is:"+b);  
            }
            else
            {
                System.out.println("the largest number is:"+c);
            }
        }
    }   
}
