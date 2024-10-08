//Example of abstruct class in java
 abstract class Shape{
    protected String color;
    public Shape(String color){
        this.color=color;
    }
    //print color of shape
    void display(){
        System.out.println("color of Shape is:"+color);
    }
    // creating abstruct methos
    abstract double calculateArea();
}
 class circle extends Shape{
    private double rad;
    public circle(String clr,double red){
        super(clr);
        rad=red;
    }
   double calculateArea(){
    double area=Math.PI*rad*rad;
    return area;
   }
}
public class Program14 {
    public static void main(String[] args) {
        circle c1=new circle("Red", 5.0);
        c1.display();
        System.out.println(" Area of circle is:"+c1.calculateArea());
    }
}
