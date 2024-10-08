public class Example11 {
    //pattern 1
    /*
     1 
     1 2 
     1 2 3 
     1 2 3 4 
     1 2 3 4 5 
     */
    void pattern1(int n){
       //outer loop
       for(int i=1;i<=n;i++){
        //inner loop
        for(int j=1;j<=i;j++)
        {
            System.out.print(j+" ");
        }
        System.out.println();
       }
    }
    //pattern 2
    /*
       1 
       2 3 
       4 5 6 
       7 8 9 10 
       11 12 13 14 15 
     */
    int count=0;
    void pattern2(int n){
        //outer loop
        for(int i=1;i<=n;i++){
            //inner loop
            for(int j=1;j<=i;j++){
                count++;
                System.out.print((count)+" ");
            }
            System.out.println();
        }
    }
    //pattern3
    /*
         1 
       1 2 3 
      1 2 3 4 5 
    1 2 3 4 5 6 7 
  1 2 3 4 5 6 7 8 9 
     */
    void pattern3(int n){
        int row,col;
        // outer loop
        for(row=1;row<=n;row++){
            int numberofspace=n-row;// calculate num of spaces in collumn
            //printing ---> spaces
            for(int s=1;s<=numberofspace;s++){
                System.out.print("  ");
            }
            // printing -->stars
            for(col=1;col<=(2*row)-1;col++){
                System.out.print(col+" ");
            }
            // next line
            System.out.println();
        }
    }
    //pattetn4
    /*
         1 
        1 1 
       1 1 1 
      1 1 1 1 
     1 1 1 1 1 

     */
    void pattern4(int n)
    {
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
                if((row+col)/2 == 0){
                System.out.print("0 ");
                }
                else{
                    System.out.print("1 ");
                }
            }
            // next line
            System.out.println();
        }
    }
    //pattern5
    /*
       1 
       1 1 
       1 2 1 
       1 3 3 1 
       1 4 6 4 1 
       1 5 10 10 5 1 
     */
    void pattern5(int n){
      //outer loop
      for(int row=1;row<=n;row++){
        int x=1;
        //inner loop
        for(int col=1;col<=row;col++){
            System.out.print(x+" ");
            x=x*(row-col)/col;
        }
        //new line
        System.out.println();
      }  
    }
    //pattern6
    /*
       1 
       2 2 
       3 3 3 
       4 4 4 4 
       5 5 5 5 5 
     */
    void pattern6(int n){
        //outer loop
        for(int row=1;row<=n;row++){
            //inner loop
            for(int col=1;col<=row;col++){
                System.out.print(row+" ");
            }
            System.out.println();
        }
    }
    //pattern7
    /*
     1 1 1 1 1 
     2 2 2 2 2 
     3 3 3 3 3 
     4 4 4 4 4 
     5 5 5 5 5 
     */
    void pattern7(int n){
        //outer loop
        for(int row=1;row<=n;row++){
            //inner loop
            for(int col=1;col<=n;col++){
                System.out.print(row+" ");
            }
            //new line
            System.out.println();
        }
    }
    //pattern 8
    /*
        1 
       2 2 
      3 3 3 
     4 4 4 4 
      5 5 5 
       6 6 
        7 
     */
    void pattern8(int n){
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
                System.out.print(row+" ");
            }
            // next line
            System.out.println();
        }
    }
    //pattern 10
    /*
     1 2 3 4 5 
      2 3 4 5 
       3 4 5 
        4 5 
         5 
        4 5 
       3 4 5 
      2 3 4 5 
     1 2 3 4 5
        
     */
    void pattern10(int n){
        int sp=n;
        int count=1;
        //outer loop for number of row/lines
        for(int row=1;row<2*n;row++){
            //inner loop for printing spaces
            for(int i=1;i<=sp;i++){
                System.out.print(" ");
            }
            //inner loop for printing numbers
            for(int col=count;col<=n;col++){
                System.out.print(col+" ");
            }
            System.out.println();// newline
            //upper part
             if(row<n){
               sp=sp+1;//increasing number of spaces
                count++;// increasing numbers
             }
            //down part
             else
             {
                sp=sp-1;//decreasing number of spaces
                count--;//decreasing numbers
            }
        }
    }
    //pattern9
    /*
    1 
  2 1 2 
3 2 1 2 3 
  2 1 2 
    1 
     */
    void pattern9(int n){
        int sp=n/2;
        int num=1;
        //outer loop for number of row
        for(int row=1;row<=n;row++){
            //inner loop for printing space
            for(int i=1;i<=sp;i++){
                System.out.print("  ");
            }
            //inner loop for printing numbers
            int count=num / 2 + 1;
            for(int col=1;col<=num;col++){
                System.out.print(count+" ");
                if(col<=num/2)
                {
                    count--;
                }
                else{
                    count++;
                }
            }
            System.out.println();
            if(row<=n/2){
                sp=sp-1;
                num=num+2;
            }
            else
            {
                sp=sp+1;
                num=num-2;
            }
        }
    }
    //pattern11
    /*
            1 2 3 4 
            1 2 3 
            1 2 
            1 
            1 2 
            1 2 3 
            1 2 3 4 
     */
    void pattern11(int n){
        int y=0;
        //outer loop number of lines
        for(int row=1;row<2*n;row++){
            //inner loop
            if(row<=n){
             y=(n+1)-row;
            }
            else{
              y=(row+1)-n;  
            }
            for(int col=1;col<=y;col++){
                System.out.print(col+" ");
            }
            System.out.println();
        }
    }
    //pattern12
    /*
         1 0 1 0 1 
         0 1 0 1 0 
         1 0 1 0 1 
         0 1 0 1 0 
         1 0 1 0 1 
     */
    void pattern12(int n){
        //outer loop
        for(int row=1;row<=n;row++){
            //inner loop
            for(int col=1;col<=n;col++){
                //printing numbers
                if((row+col)%2==0){
                    System.out.print("1 ");
                }
                else{
                    System.out.print("0 ");
                }
            }
            System.out.println();//new line
        }
    }
    //pattern 13
    /*
    0 
    0 1 
    0 1 0 
    0 1 0 1 
    0 1 0 1 0 
    0 1 0 1 0 1 
       
     */
    void pattern13(int n){
        //outer loop for number of lines/row
        for(int row=1;row<=n;row++){
            //inner loop number of collumn
            for(int col=1;col<=row;col++){
                if(col%2 == 0){
                System.out.print("1 ");
                }
                else{
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
    }
    //pattern 14
    /* 
         0 0 0 0 0 
         1 1 1 1 
         0 0 0 
         1 1 
         0 
     */
    void pattern14(int n){
        //outer loop 
        for(int row=1;row<=n;row++){
            //inner  loop
            for(int col=row;col<=n;col++){
                if(row%2 == 0){
                    System.out.print("1 ");
                }
                else{
                    System.out.print("0 ");
                }
            }
            System.out.println();// newLine
        }
    }

    public static void main(String[] args) {
        Example11 obj=new Example11();
        //obj.pattern1(5);
        //obj.pattern2(5);
        // obj.pattern3(5);
        //obj.pattern4(5);
        //obj.pattern5(6);
        //obj.pattern6(5);
        //obj.pattern7(5);
        //obj.pattern8(4);
        //obj.pattern9(5);
        obj.pattern10(5);
        //obj.pattern11(4);
        //obj.pattern12(5);
        //obj.pattern13(6);
        // obj.pattern14(5);
    }
}
