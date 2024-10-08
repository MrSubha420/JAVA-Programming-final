//Example of single inheritance injava
//create a company class honda and inherited all the property in motorcycle
class Company{
    String name = " Honda";
    String type = " Bike";
}
class bikedetail extends Company{
    int milaze;
    int prise;
    String info;
    void getdata(int milaze , int prise , String info){
        this.milaze=milaze;
        this.prise=prise;
        this.info=info;
    }
    void displayallData(){
        System.out.println("company name is"+name);
        System.out.println(" type of company is"+type+"company");
        System.out.println("bike prise="+prise);
        System.out.println("Total milage = "+milaze+"KM/H");
        System.out.println(" Bike Detail:"+info);
    }

}
public class Program6 {
    public static void main(String[] args) {
        //creating object of BikeDetail class 
        bikedetail bl=new bikedetail();
        bl.getdata(120,65000," Good product depends on low prise");
        bl.displayallData();
    }
}
