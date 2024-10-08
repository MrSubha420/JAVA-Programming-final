//how to object pass as a argument.
class Display{
    String msg;
    Display(String msg){
        this.msg=msg;
    }
    void showData(Display dsp){
        System.out.println(this.msg);
        System.out.println(dsp.msg);
    }
}
public class Program28 {
    public static void main(String[] args) {
        // creating object 1
        Display ob1=new Display("This is first object");
        //creating object 2
        Display obj2=new Display("This is second object");
        //calling showData method ans pass obj2 as a parameater.
        ob1.showData(obj2);
    }
}
