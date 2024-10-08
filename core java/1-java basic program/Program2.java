//Write a java program to show scope of variables
public class Program2 {
    static int c=45;// static variable
    int a=20;//Instance variable
    public static void main(String[] args) {
        int b=50;//local variable
        Program2 obj=new Program2();
        /* Static variable are decleare with in class but out of main method;
         static variable are accessable with in same class , without creating object.*/
        System.out.println("static variable b="+c);
         /* instance variable are decleare with in class but out of main method;
          variable are accessable with in same class ,through object for this class.*/
        System.out.println("instance variable a="+obj.a);  
         /* local variable are decleare with in class and  main method;
         local variable are accessable with in same class ,with out creating object*/
         System.out.println("local variable b="+b);
    }
}
