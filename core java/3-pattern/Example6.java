/*
1) right half pyramid star pattern. 

* 
* * 
* * * 
* * * * 
* * * * * 

2) reverse right half pyramid star pattern. 

* * * * *
* * * *
* * *
* *
*

3)Left half pyramid star pattern.

        *
      * *
    * * * 
  * * * *
* * * * * 
4)Reverse Left half pyramid star pattern.

* * * * *
  * * * *
    * * *
      * *
        *

*/
public class Example6 {
    void rightHalfPyramid(int n){
        int i,j;
        //outer loop
        for(i=1;i<=n;i++){
            //inner loop
            for(j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();// new line
        }
    }
    void reerseRightHalfPyramid(int n){
        int i,j;
        //outer loop
        for(i=1;i<=n;i++){
            //inner loop
            for(j=i;j<=n;j++){
                System.out.print("* ");
            }
            System.out.println();// new line
        }
    }
    void LeftHalfPyramid(int n){
        int i,j;
        //outer for loop
        for(i=1;i<=n;i++){
            //inner loop --> print spaces
            for(int s=1;s<=n-i;s++){
                System.out.print("  ");
            }
            // inner loop --> print star
            for(j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();//new line
        }
    }
    void reverseLeftHalfPyramid(int n){
        int i,j;
        //outer for loop
        for(i=1;i<=n;i++){
            // inner loop --> print star
            for(j=i;j<=n;j++){
                System.out.print("* ");
            }
            System.out.println();//new line
        
            //inner loop --> print spaces
            for(int s=1;s<=i;s++){
                System.out.print("  ");
            }
        } 
    }
    public static void main(String[] args) {
       Example6 obj=new Example6();
       System.out.println(" Right half pyramid:");
       obj.rightHalfPyramid(5); 
       System.out.println(" Reverse Right half pyramid:");
       obj.reerseRightHalfPyramid(5);
       System.out.println(" Left half pyramid:");
       obj.LeftHalfPyramid(5);
       System.out.println("Reverse  Left half pyramid:");
       obj.reverseLeftHalfPyramid(5);
    }
}
