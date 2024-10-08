//Example of copy construter in java.
class constructer_fruit{
    int fruit_prise;
    String fruit_name;
    //constructor invocked
    constructer_fruit(int fruit_prise,String fruit_name){
        this.fruit_prise=fruit_prise;
        this.fruit_name=fruit_name;
    }
    // copy constructer invocked
    constructer_fruit(constructer_fruit mycon){
        fruit_prise=mycon.fruit_prise;
        fruit_name=mycon.fruit_name;
    }
    //print the details about fruit
    void display(){
        System.out.printf("\n %s %d rupies per kg.",fruit_name,fruit_prise);
    }
}
public class Program16 {
    public static void main(String[] args) {
        // first constructer calling.
        constructer_fruit c1=new constructer_fruit(40, "Apple");
        c1.display();
        //calling copy constructer
        constructer_fruit c2=new constructer_fruit(c1);
        c2.display();
    }
}
