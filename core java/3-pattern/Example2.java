/*
print triangle star pattern :
       *
      * *
     * * *
    * * * *
   * * * * *
   
 */
public class Example2 {
    public static void main(String[] args) {
        int n=5;
        int row,col;
        // outer loop
        for(row=1;row<=n;row++){
            int numberofspace=n-row;// calculate num of spaces in collumn
            //printing ---> spaces
            for(int s=1;s<=numberofspace;s++){
                System.out.print(" ");
            }
            // printing -->stars
            for(col=1;col<=row;col++){
                System.out.print("* ");
            }
            // next line
            System.out.println();
        }
    }
}


