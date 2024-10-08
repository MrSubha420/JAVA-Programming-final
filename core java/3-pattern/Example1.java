
/* print Ractangle star pattern. 

  * * * * * *
  * * * * * *
  * * * * * *
  * * * * * *
  * * * * * *
  * * * * * *
 
 */
class Example1{
    public static void main(String[] args) {
        int i=0,j=0;
        for (i=0;i<6;i++){
            for(j=0;j<6;j++){
                System.out.print(" *");
            }
            System.out.println();
        }
    }
}