//Example of multi level inheritance 
class Bank1{
    String bank_name =" STATE BANK OF INDIA";
    int bank_code=721444;
}
class customer1 extends Bank1{
    String cust_name;
    String address;
    int customer_id;
    String adhar_no;
    void puttData( String cust_name,String address,int customer_id,String adhar_no){
    this.cust_name=cust_name;
    this.address=address;
    this.customer_id=customer_id;
    this.adhar_no=adhar_no;
    }
    void show_customerDetail(){
        System.out.println("customer name : "+cust_name);
        System.out.println("customer address : "+address);
        System.out.println("customer id :"+customer_id);
        System.out.println("customer adher no : "+adhar_no);
    }
}
class Account extends customer1{
    int acconunt_no;
    String account_type;
    Account(int acconunt_no,String acount_type){
        this.acconunt_no=acconunt_no;
        this.account_type=acount_type;
    }
    void displayaccountDetail(){
        System.out.println("Bank name : "+bank_name);
        System.out.println("bank_code :"+bank_code);
        System.out.println("Acount no: "+acconunt_no);
        System.out.println("Account type : "+account_type);
    }
}
public class Program7 {
    public static void main(String[] args) {
        Account ac=new Account(20001,"sevings account");
        Account ac1=new Account(2001,"current account");
        ac.puttData("Subhadip Manna", "Vill- Benyajhi , p.o- nachinda , east mednipur ",2001,"2001 2345 6789 0987");
        ac1.puttData("sovon giri", "vill- kanaidighi, dist- burdwan ", 2002, "3214 6789 0987 3215");
        //customeer 1
        ac.show_customerDetail();
        ac.displayaccountDetail();
        System.out.println();
        //customer 2
        ac1.show_customerDetail();
        ac1.displayaccountDetail();
    }
    
}
