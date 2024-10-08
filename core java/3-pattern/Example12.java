/*
Example 12 : print the following Alphabet pattern using java language
1) right alphabatic triangle pattern 
2) repeating alaphabatic pattern.
3) Triangle character pattern.
4) Print the following pattern .
*/
public class Example12 {
   //pattern 1
   /*
   
   A 
   A B 
   A B C 
   A B C D 
   A B C D E 

   */
   
   
   void pattern1(int n){
    int chracter=65;
     // outer loop
     for(int row=1;row<=n;row++){
        //inner loop
        for(int col=0;col<row;col++){
            System.out.print((char)(chracter+col)+" ");
        }
        System.out.println();
     }
   }

  //pattern 2
  /* 
  A 
  B B 
  C C C  
  D D D D 
  E E E E E 
  */
   
   void pattern2(int n){
    int chracter=65;
     // outer loop
     for(int row=1;row<=n;row++){
        //inner loop
        for(int col=1;col<=row;col++){
            System.out.print((char)(chracter)+" ");
        }
        chracter=chracter+1;
        System.out.println();
     }
  }

  //pattern 3
  /* 

           A   
         A   B   
       A   B   C   
     A   B   C   D   
   A   B   C   D   E   

   */

   
  void pattern3(int n){
    int chracter=65;
     // outer loop
     for(int row=1;row<=n;row++){
        //inner loop spaces
        for(int i=1;i<n-row+1;i++){
            System.out.print("  ");
        }
        for(int col=0;col<row;col++){
            System.out.print((char)(chracter+col)+"   ");
        }
        System.out.println();
     }
  }

  //pattern 4
/* 
  A 
  B C 
  D E F 
  G H I J 
  K L M N O 

  */
   
  void pattern4(int n){
    int chracter=65;
     // outer loop
     for(int row=1;row<=n;row++){
        //inner loop
        for(int col=0;col<row;col++){
            System.out.print((char)(chracter)+" ");
            chracter++;
        }
        System.out.println();
    }
  }
   public static void main(String[] args) {
    //creating object
    Example12 ob=new Example12();
    //ob.pattern1(5);//calling pattern 1
     // ob.pattern2(5);//calling pattern 2
     //ob.pattern3(5);//calling pattern 3
      ob.pattern4(5);//calling pattern 4
   }
}
