/*print the following hollow trinangle pattern

     * 
    * * 
   *   * 
  *     * 
 *       * 
* * * * * * 
*/
public class Example8 {
    public static void main(String[] args) {
        int n=6;
        int row,col;
        // outer loop
        for(row=1;row<=n;row++){
            int numberofspace=n-row;// calculate num of spaces in collumn
            //printing ---> spaces
            for(int s=1;s<=numberofspace;s++){
                System.out.print(" ");
            }
            // printing -->stars & spaces
            for(col=1;col<=row;col++){
                if(row==1||col==1||row==n||col==n||row==col){
                System.out.print("* ");// for star
                }
                else{
                    System.out.print("  ");// for spaces
                }
            }
            // next line
            System.out.println();
        }
    }
    
}
