//java program to show encapsulation in class.
//encapsulation: encapsulate all the datamembers (variables) make it private , access through public getter  & setter methods.
//Advantage: data hiding.
class encapsulateTest{
    private long acc_no;
    private String name,email;
    private float amount;
    //public getter and setter methods  
    public long getAcc_no() {  
        return acc_no;  
    }  
    public void setAcc_no(long acc_no) {  
        this.acc_no = acc_no;  
    }  
    public String getName() {  
        return name;  
    }  
    public void setName(String name) {  
        this.name = name;  
    }  
    public String getEmail() {  
        return email;  
    }  
    public void setEmail(String email) {  
        this.email = email;  
    }  
    public float getAmount() {  
        return amount;  
    }  
    public void setAmount(float amount) {  
        this.amount = amount;  
    }  
      
 } 
    
    class Program20{
        public static void main(String[] args) {
             //creating instance of Account class  
             encapsulateTest acc=new encapsulateTest();  
              //setting values through setter methods  
              acc.setAcc_no(7560504000L);  
              acc.setName("Sonoo Jaiswal");  
              acc.setEmail("sonoojaiswal@javatpoint.com");  
               acc.setAmount(500000f);  
               //getting values through getter methods  
               System.out.println("Account no:"+acc.getAcc_no());
               System.out.println("Customer name:"+acc.getName());
               System.out.println("Account Balance:"+acc.getAmount());
               System.out.println("Customer Email:"+acc.getEmail());
        }
    }