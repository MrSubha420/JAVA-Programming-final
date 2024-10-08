/* Print Diamond Star pattern.
    * 
   * * 
  * * * 
 * * * * 
* * * * * 
 * * * * 
  * * * 
   * * 
    * 
              
 */
class Example4DiamondStarPattern{
    public static void main(String[] args) {
        int n=6;
        int row,col;
        // outer loop
        for(row=1;row<=n*2;row++){
            //relation b2n collumn & row
            int totalColInRow= row>n? 2*n-row:row;//calculate number of collumns in row
            int numberofspace=n-totalColInRow;// calculate num of spaces in collumn
            //printing ---> spaces
            for(int s=1;s<=numberofspace;s++){
                System.out.print(" ");
            }
            // printing -->stars
            for(col=1;col<=totalColInRow;col++){
                System.out.print("* ");
            }
            // next line
            System.out.println();
        }
    }
}