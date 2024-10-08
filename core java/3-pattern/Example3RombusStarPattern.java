/* Print Rhombus star pattern
 
          *********
         *********
        *********
       *********
      *********    

 */
class Example3RombusStarPattern{
    public static void main(String[] args) {
        //outer loop
        for(int i=1;i<=5;i++){
            //ineer loop ---> printing space
            for(int j=1;j<=5-i;j++){
                System.out.print(" ");
            }
            //inner loop --> print star
            for(int k=1;k<=5;k++){
                System.out.print("*");
            }
            System.out.println();
        }
       // System.out.println();
    }
}