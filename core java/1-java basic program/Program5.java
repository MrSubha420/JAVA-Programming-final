//Example of conditional statement (if ,if-else,else if ladder,nesting of if-else)
// simple if
import java.util.Scanner;
class Example_If{
    void checking_present(int roll){
        int arr[]={1,6,9,10,15,67,45,34,23,24,89};
        for(int i=0;i<arr.length;i++){
            if(arr[i]==roll){
                System.out.println("roll no"+roll +"present this class");
            }
        }
    }
}
// else-if
class Example_Else_If{
     void checkValidVoter(int age){
        if(age>18)
        {
            System.out.println("valid voter");
        }
        else
        {
            System.out.println("Invalid vater");
        }
     }
}

//nesting if-else
class Nesting_If_Else{
    void donateBlood(int age,int waight){
        if(age>14){
            if(waight>35){
                System.out.println("eligible for donating blood");
            }
            else{
                System.out.println("you are not elegible donating blood because your waight is less than 35");
            }
        }
        else{
            System.out.println("you are not elegible donating blood because your age is less than 14");
        }
    }
}
//Else_If ladder
class Else_If_Ladder{
  void admissionCourse(int rank ){
    if(rank<100){
        System.out.println("eligible for admission top goverment collage");
    }
    else if (rank>100 && rank<1000) {
        System.out.println("eligible for admission semi goverment collage");   
    }
    else if (rank>100 && rank <10000) {
        System.out.println("eligible for admission top private collage");
    }
     else {
        System.out.println("eligible for admission any private collage");
    }
  }
}
public class Program5 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            while(true){
             System.out.println("enter roll:");
            int x=sc.nextInt();
            Example_If obj1= new Example_If();
            obj1.checking_present(x);
            System.out.println("enter age:");
            int age=sc.nextInt();
            Example_Else_If obj2=new Example_Else_If();
            obj2.checkValidVoter(age);
             System.out.println("enter age & Waight:");
            int age1=sc.nextInt();
            int waight=sc.nextInt();
            Nesting_If_Else obj3=new Nesting_If_Else();
            obj3.donateBlood(age1, waight);
            System.out.println("enter rank:");
            int rank=sc.nextInt();
            Else_If_Ladder obj4= new Else_If_Ladder();
            obj4.admissionCourse(rank);
            }
        }
    }
}
