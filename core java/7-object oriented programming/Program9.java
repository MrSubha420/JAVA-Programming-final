//Example of multi lebel inheritance in java
class Account1{
    String cus_name;
    int acount_number;
    String bank_name ="STATE BANK OF INDIA";
}
class SevingsAccount1 extends Account1{
     int r=10;
     int p,t,i;
     // calculate interest
     void calculate_interest(int p,int t){
        this.p=p;
        this.t=t;
        i=(p*t*r)/100;
     }
     //get all the account detail
     void putAccountDetail(String name,int n){
        cus_name=name;
        acount_number=n;

     }
     // printing all detail
     void display(){
        System.out.println("Bank Name:"+bank_name);
        System.out.println("Customer Name:"+cus_name);
        System.out.println("account type sevings account");
        System.out.println("your invest amount is:"+p);
        System.out.println("After"+t+"years you got :"+i+p);
     }
}
//anather class which are inherited from account class
class CurrentAccount1 extends Account1{
     int r=12;
     int p,t,i;
     // calculate interest
     void calculate_interest(int p,int t){
        this.p=p;
        this.t=t;
        i=(p*t*r)/100;
     }
     //get all the account detail
     void putAccountDetail(String name,int n){
        cus_name=name;
        acount_number=n;

     }
     // printing all detail
     void display(){
        System.out.println("Bank Name:"+bank_name);
        System.out.println("Customer Name:"+cus_name);
        System.out.println("account type Current account");
        System.out.println("your invest amount is:"+p);
        System.out.println("After"+t+"years you got :"+i+p);
     }
}

public class Program9 {
    public static void main(String[] args) {
      // creating object of Sevingsaccount class
      SevingsAccount1 sa=new SevingsAccount1();
      CurrentAccount1 cu=new CurrentAccount1();
      sa.calculate_interest(2000, 3);
      sa.putAccountDetail("subhadip manna", 123456);
      sa.display();
      System.out.println();
      cu.calculate_interest(2000, 3);
      cu.putAccountDetail("souvik manna", 987654);
      cu.display();;
    }
}
