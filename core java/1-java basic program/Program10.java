//Swaping of two integer using third vaiable & with out using third variable.
class SwapingNumber{
    int x;
    int y;
    // get data
    void readData(int x,int y){
        this.x=x;
        this.y=y;
    }
    //swap data using third variable
    void swap(){
        int c;
        c=x;
        x=y;
        y=c; 
    }
    //swapdata without using third variable
    void swapData(){
        x=x+y;
        y=x-y;
        x=x-y;
    }
    //show data
    void show(){
        System.out.println("x = "+x);
        System.out.println("y = "+y);
    } 

}

public class Program10 {
    public static void main(String[] args) {
        SwapingNumber obj=new SwapingNumber();
        obj.readData(6,10); 
        System.out.println("Before swapping:");
        obj.show();
        obj.swap();
        System.out.println("After swapping:");
        obj.show();
        obj.swapData();
        System.out.println("After Reswaping:");
        obj.show();

    }
}
