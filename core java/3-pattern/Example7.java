
/* print Ractangle star pattern. 

  * * * * * *
  *         *
  *         *
  *         *
  *         *
  * * * * * *
 
 */
class Example7{
    public static void main(String[] args) {
        int row,col,n=6;
        //outer loop
        for(row=1;row<=n;row++){
            // iner loop --> printing star
            for(col=1;col<=n;col++){
                if(row==1 || col==1 || row==n || col==n){
                System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            // NEW LINE
            System.out.println();
        }
    }
}