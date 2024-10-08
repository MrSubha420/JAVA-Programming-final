class Myclass{
    int n;
    Myclass(int n){
        this.n=n;
        System.out.println("value of n:"+n);
    }
}
class Subclass2 extends Myclass{
    int x;
    Subclass2(int m,int b){
        super(m);
        System.out.println("value of b:"+b);
        x=b;
    }
    void sum(){
        int sum=n+x;
        System.out.println("total :"+sum);
    }
}
class Program12{
    public static void main(String[] args) {
        // creating object of subclass
        Subclass2 ob=new Subclass2(5, 9);
        ob.sum();
    }
}