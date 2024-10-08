//operater overloading in java
// there are no primarily over loaded operator not support.
// but only "+" operator are overloaded 
// "+" : used as a concating two string 
//"+": used as a arithmatic addition operation. 
//example:
class OperatorOverloading{
    OperatorOverloading(int x,int y){
        int avg=(x+y)/2;// used as a arithmic operator
        System.out.println("Average of("+x+" and "+y+") :"+avg);//used for concating to string
    }
}
public class Program18 {
    public static void main(String[] args) {
        new OperatorOverloading(45, 67);
    }
}
