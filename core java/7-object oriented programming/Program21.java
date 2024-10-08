//show the different type of access modifier in java.
class Variables{
    private int x=50;
    protected int y=78;
    public int z=43;
    public void show(){
         //Accable in same class.
        System.out.println("x="+x);
        System.out.println("y="+y);
        System.out.println("z="+z);
    }
}

class ExampleOfAccessModifier extends Variables{
    void display(){
        //Accable sub class
        System.out.println("x is not accable because of private datamember");
        System.out.println("y="+y);
        System.out.println("z="+z);
    }
}
    
class Program21{
    public static void main(String[] args) {
        ExampleOfAccessModifier obj=new ExampleOfAccessModifier();
        obj.show();
        obj.display();
    }
}