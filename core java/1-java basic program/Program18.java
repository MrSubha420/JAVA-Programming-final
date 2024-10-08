//find the distance between two points.
//formula Distance = √((x2 - x1)² + (y2 - y1)²)
//Pythagorean theorem
import java.util.Scanner;
public class Program18 {
  public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    System.out.println("Point 1: Enter value of x1 and y1:");
    double x1=sc.nextDouble();
    double y1=sc.nextDouble();
     System.out.println("Point 2: Enter value of x2 and y2:");
    double x2=sc.nextDouble();
    double y2=sc.nextDouble();
    double distance=Math.sqrt(Math.pow((x2-x1),2)+Math.pow((y2-y1),2));
    System.out.printf("Point1(%2f,%2f) to point2(%2f,%2f) distance is:%2f",x1,y1,x2,y2,distance);
    sc.close();
  }  
}

