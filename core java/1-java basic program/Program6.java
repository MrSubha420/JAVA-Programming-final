//Example of loops(for lop ,while loop, do while loop)
public class Program6 {
    public static void main(String[] args) {
        //For loop example
        //printing array
        int arr[]={100,300,500,700,200};
        for(int i=0;i<arr.length;i++){
            System.out.println("Using For loop ,element"+i+":"+arr[i]);
        }
        //While loop example
        //printing all the even number in between 1 to 20;
        int x=2;
               System.out.println("Even numbers in between 2 to 20:");
               while(x<20){
                   System.out.println(x);
                   x+=2;
               } 
           
        //Example of do-while loop
               int n=1;
               int sum=0;
               do{
                    sum=sum+n;
                    n++;
               } while(n<=100);
               System.out.println("sum of 1 to 100 is "+sum);
    }   
}
