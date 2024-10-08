// write a program in java to convert a simple undirected graph to adjacency matrix.
// vertex  = 1, 2, 3, 4, 5.
// edges = 1-2, 1-5, 1-3, 1-4, 2-3, 2-4, 2-5, 3-4, 3-5, 4-5.

import java.util.*;
class graphToMatrix
{
    public static void main(String [] arg)
    {
        int n;
        char ch;
        Scanner sr = new Scanner(System.in);
        System.out.print("Enter the total number of vertex : ");
        n = sr.nextInt();
        sr.nextLine();
        int [][] fv = new int[n][n];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.print("Is vertex "+(i+1)+" connected to "+(j+1)+"?(press y/n) : ");
                ch = sr.nextLine().charAt(0);
                if(ch == 'y' || ch == 'Y')
                {
                    fv[i][j] = 1;
                }
                else
                {
                    fv[i][j] = 0;
                }
            }
        }
        System.out.println("The matrix :-");
        for(int i=1;i<=n;i++)
        {
            System.out.print("\t"+i);
        }
        System.out.println();
        for(int i=0;i<n;i++)
        {
            System.out.print(i+1);
            for(int j=0;j<n;j++)
            {
                System.out.print("\t"+fv[i][j]);
            }
            System.out.println();
        }
    }
}
