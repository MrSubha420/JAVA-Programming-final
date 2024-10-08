

/* Pascal pattern program in java.(numbers)
      1
     1 1
    1 2 1
   1 3 3 1
  1 4 6 4 1
 */
public class Example10 {
    int fact(int x){
        int factorial=1;
        for(int i=1;i<=x;i++){
          factorial=factorial*i;  
        }
        return factorial;
    }
    public static void main(String[] args) {
        Example10 obj=new Example10();
       int n=4;
       //outer itteration
       for(int row=0;row<=n;row++){
        //inner iteration for print blank spaces
        for(int sp=0;sp<=(n-row);sp++){
            System.out.print(" ");
        }
        //printing umbers
        for(int col=0;col<=row;col++){
            System.out.print(" "+obj.fact(row)/((obj.fact(row-col))*obj.fact(col)));
        }
        System.out.println();
       }
    }
}