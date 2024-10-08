//show data hiding in class.
// Data hiding is the hide the internal data of the class . 
//in java encapsulate is the process which are using to achive to data hiding.
class DataHiding{
    private String name;
    private int age;
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
    public int getAge(){
        return age;
    }
    public void setAge(int age){
        this.age=age;
    }
}
class personalInfo extends DataHiding{
   public  void display(){
        System.out.println(" this is example of data hiding");
    }
}
public class Program22 {
    public static void main(String[] args) {
    
    personalInfo obj =new personalInfo();

    obj.display();
    obj.setAge(20);
    obj.setName("subhadip manna");
    System.out.println("my name is:"+obj.getName());
    System.out.println("Age is "+obj.getAge());
    }

}
