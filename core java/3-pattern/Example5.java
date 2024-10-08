/* 
print  butterfly star pattern.
     *           *
     * *       * *
     * * *   * * *
     * * * * * * *
     * * *   * * * 
     * *       * *
     *           *      
*/
public class Example5 {
    public static void main(String[] args) {
        int row,col,n=7;
        //outer loop
        for(row=1;row<=n;row++)
        {  

           int space= row>=(n/2)? (row*2)-n: (n-(2*row));// calculate space
           col= row>(n/2)? n-row:row ;// calculate collumn
           // printing star1
           for(int i=1;i<=col;i++){
            System.out.print("* ");
           }
           //printing space
           for(int s=1;s<=space;s++){
           System.out.print("  ");
           }
           //printing star2
           for(int i=1;i<=col;i++){
            System.out.print("* ");
           }
           // new line
           System.out.println();
        }
    }
}
