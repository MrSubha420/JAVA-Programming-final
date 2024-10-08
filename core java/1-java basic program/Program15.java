//find the reverse of the number.
public class Program15 {
    int rev=0;
    //using recursion
    void findReverse(int n){
        if(n != 0){
        int reminder=n%10;
        rev=rev*10+reminder;
        n=n/10;
        findReverse(n);
    }
}
//uing while loop
void findReverse_using_while_loop(int n){
    while(n != 0){
        int reminder=n%10;
        rev=rev*10+reminder;
        n=n/10;
    }
}
//using for loop
void findReverse_using_for_loop(int n){
    for(rev=0;n != 0;n=n/10){
        int reminder=n%10;
        rev=rev*10+reminder;
    }
}
//display reverse of the number
void display(){
    System.out.println("Reverse of the number is:"+rev);
}
  public static void main(String[] args) {
    Program15 obj=new Program15();
    //obj.findReverse(1234);
    //obj.findReverse_using_while_loop(67854);
    obj.findReverse_using_for_loop(23516);
    obj.display();
  }  
}
