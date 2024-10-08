// Example of method over loading or compile time poly morphism
//method over loading is primaryly known as compile time poly morphism.
//method can be over loaded two ways-
//  1- by changing number of parameters.
//   2- by changing types of parameaters.
class MethodOverloading{
    // 1- changing numbers of parameater
    int add(int a,int b,int c){
        int sum=a+b+c;
        return sum;
    }
    int add(int x,int y){
        int sum=x+y;
        return sum;
    }
    // 2- changing types of parameater
    void printData(String str){
        System.out.println("massage is :"+str);
    }
    void printData(int n){
        System.out.println(" number is:"+n);
    }
}
public class Program17 {
    public static void main(String[] args) {
        MethodOverloading ob=new MethodOverloading();
       System.out.println(ob.add(2,5,7));
        System.out.println(ob.add(9,7));
        ob.printData("method are overloaded by changing types of parameater.");
        ob.printData(44);
    }
}
