//example of this keyword 
class ComplexNumber{
    double rear=0.0;
    double img=0.0;
    void getData(double rear,double img){
        this.rear=rear;
        this.img=img;
    }
    ComplexNumber add(ComplexNumber num2){
        double addrear=this.rear+num2.rear;
        double addimg=this.img+num2.img;
        System.out.println(addrear +"+"+addimg+"i");
          return null;
    }
    
}
public class Program5 {
    public static void main(String[] args) {
        ComplexNumber num1=new ComplexNumber();
        ComplexNumber num2=new ComplexNumber();
        num1.getData(2.5, 5.6);
        num2.getData(5.8, 4.3);
        num1.add(num2);
    }
}
