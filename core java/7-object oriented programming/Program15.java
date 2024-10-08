//Example of constructer overloading in java.
class constructer{
    // calculate factorial of number same constructer.
     int fact=1;
    constructer(int no){
        for(int i=1;i<=no;i++){
            fact=fact*i;
        }
        System.out.printf("factorial of %d is %d",no,fact);
        System.out.println();
    }
    // printing statement same constructer.
    String str;
    constructer(String str){
        this.str=str;
        System.out.println("massage is:"+str);
        System.out.println();
    }
    // add two floating number same constructer.
    float sum=0;
    constructer(float n,float m){
        sum=n+m;
        System.out.printf("%f + %f : %f",n,m,sum);
        System.out.println();
    }

} 
public class Program15 {
    public static void main(String[] args) {
        new constructer(4,7);
        new constructer("This is constructer overloading.");
        new constructer(5);

    }
    
}
