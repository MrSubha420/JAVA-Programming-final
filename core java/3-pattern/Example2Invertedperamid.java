/*
print inverted peramid triangle star pattern :
* * * * * 
 * * * * 
  * * * 
   * * 
    * 
   
 */
 class Example2Invertedperamid {
    public static void main(String[] args) {
        int n=5;
        int row,col;
        // outer loop
        for(row=1;row<=n;row++){
            int numberofspace=row;// calculate num of spaces in collumn
            int numberofcol=(n+1)-row;// calculate number of collumns in a row
            // printing -->stars
            for(col=1;col<=numberofcol;col++){
                System.out.print("* ");
            }
            System.out.println();
             //printing ---> spaces
             for(int s=1;s<=numberofspace;s++){
                System.out.print(" ");
            }
            // next line
            //System.out.println();
        }
    }
}
