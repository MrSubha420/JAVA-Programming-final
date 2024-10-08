/* print the following k pattern 

* * * * * 
* * * * 
* * * 
* * 
* 
* 
* * 
* * * 
* * * * 
* * * * * 

 
*/
public class Example9 {
    public static void main(String[] args) {
        int n=5;
        //outer loop
        int i,j,k,l;
        //outer loop
        for(i=1;i<=n;i++){
            //inner loop
            for(j=i;j<=n;j++){
                System.out.print("* ");
            }
            System.out.println();// new line
        }
        //outer loop
        for(k=1;k<=n;k++){
            //inner loop
            for(l=1;l<=k;l++){
                System.out.print("* ");
            }
            System.out.println();// new line
        }
    } 
}
