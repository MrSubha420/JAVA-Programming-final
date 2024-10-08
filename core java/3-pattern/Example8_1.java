/* print the following pattern hollow diamond
   * 
  * * 
 *   * 
*     * 
 *   * 
  * * 
   *     
*/
public class Example8_1 {
    public static void main(String[] args) {
        int n=4;
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
                if(row==1 ||col==1||row==col || row==n*2||col==totalColInRow){
                System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            // next line
            System.out.println();
        }
    }
}
