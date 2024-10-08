//super keyword used as a variable
class Superclass {
    int num = 10;
}

class Subclass extends Superclass {
    int num = 20;

    void display() {
        System.out.println("Subclass num: " + num);
        System.out.println("Superclass num: " + super.num);
    }
}

public class Program10 {
    public static void main(String[] args) {
        Subclass obj = new Subclass();
        obj.display();
    }
}
