// Super keyword used as a method
class Superclass1 {
    void display() {
        System.out.println("This is the superclass.");
    }
}

class Subclass1 extends Superclass1 {
    void display() {
        super.display(); // Calling the superclass method
        System.out.println("This is the subclass.");
    }
}

public class Program11 {
    
    public static void main(String[] args) {
        Subclass1 obj = new Subclass1();
        obj.display();
    }
}
