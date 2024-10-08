//different type of variable avilable in java
public class prog2 {
   int a=10;//instance  variable
   static int b=20;//static variable
   public static void main(String arr[])
   {
    int c=30;//Local variale
    prog2 obj=new prog2();
    System.out.println("Instance variable a value is:"+obj.a);
    System.out.println("Local variable c value is:"+c);
    System.out.println("static variable b value is:"+b);

   } 
}
