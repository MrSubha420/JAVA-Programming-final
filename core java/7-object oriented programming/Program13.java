//example of interface.
interface Vachile{
    void detail(int speed);
}
class car implements Vachile{
    public void detail(int spd){
        System.out.println("car speed :"+spd);
    }
}
public class Program13 {
    public static void main(String[] args) {
        // creating object of car class
       // Vachile obj=new Vachile(); interface does not allowed created object directly 
       //you created object via implementing classes object 
       car ob=new car();
       ob.detail(60);
    }
}
