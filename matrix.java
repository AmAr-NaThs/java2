import java.util.*;
class matrix
{
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        int a[][]=new int[10][10],i,j,n,t=0;
        System.out.println("enter the order of a square matrix");
        n=sc.nextInt();
        System.out.println("enter the elements of matrix");
        for(i=0;i<n;i++)
        for(j=0;j<n;j++)
        {
            a[i][j]=sc.nextInt();
        }
        System.out.println("the matrix is");
        for(i=0;i<n;i++)
        {
            System.out.println();
            for(j=0;j<n;j++)
            {
                System.out.println(a[i][j]+" ");
            }
        }
        System.out.println("\nTranspose is");
        for(i=0;i<n;i++)
         {
            System.out.println();
            for(j=0;j<n;j++)
            {
                System.out.println(a[j][i]+" ");
            }
         }
         for(i=0;i<n;i++)
         {
             t=t+a[i][i];
         }
         System.out.println("\ntrace"+t);
    }
}