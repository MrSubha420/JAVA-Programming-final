/*
 Example13: Java string pattern program: print the strings-

  i) Right sight triangle using string" SUBHADIP".
 ii) Repeat Right triangle using string "SUBHADIP".
 iii) Simple triangle using string "SUBHA".
  iv)  left triangle using string "SUBHADIP".
 */
public class Example13 {
 //pattern 1
 /*
S 
S U 
S U B 
S U B H 
S U B H A 
S U B H A D 
S U B H A D I 
S U B H A D I P 

  */
 void pattern1(String str){
    int n=str.length();
  //outer loop
  for(int row=1;row<=n;row++){
    //inner loop 
    for(int col=0;col<row;col++){
        System.out.print(str.charAt(col)+" ");
    }
    System.out.println(); //newLine
  }  
 }  
 
 //pattern2
 /*
S 
U U 
B B B 
H H H H 
A A A A A 
D D D D D D 
I I I I I I I 
P P P P P P P P 
   
  */
  void pattern2(String str){
    int n=str.length();
    int number=0;
  //outer loop
  for(int row=1;row<=n;row++){
    //inner loop 
    for(int col=1;col<=row;col++){
        System.out.print(str.charAt(number)+" ");
    }
    System.out.println(); //newLine
    number++;
  }  
 }  
 //pattern3
 /* 

          S   
        S   U   
      S   U   B   
    S   U   B   H   
  S   U   B   H   A  

  */
 void pattern3(String str){
  int n=str.length();
  //int number=0;
  //outer loop
  for(int row=1;row<=n;row++){
    //inner loop for spaces
    for(int sp=1;sp<=(n-row+1);sp++){
      System.out.print("  ");
    }
    //inner loop for printing chracter
    for(int col=0;col<row;col++){
      System.out.print(str.charAt(col)+"   ");
      //number++;
    }
    System.out.println();//newLine
  }
 }
 //pattern4
 /* 

    S U B H A D I P 
    S U B H A D I 
    S U B H A D 
    S U B H A 
    S U B H 
    S U B 
    S U 
    S 

*/
 void pattern4(String str){
  int n=str.length();
  //outer loop for number of lines or row
  for(int row=1;row<=n;row++){
    //inner loop 
    for(int col=0;col<((n+1)-row);col++){
      System.out.print(str.charAt(col)+" ");
    }
    System.out.println();//newLine
  }
 }
 public static void main(String[] args) {
    //creating object
    Example13 obj=new Example13();
    //obj.pattern1("SUBHADIP");
    //obj.pattern2("SUBHADIP");
    //obj.pattern3("SUBHA");
    obj.pattern4("SUBHADIP");
 } 
}
