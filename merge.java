import java.io.*;
import java.util.*;
class merge 
{
    public static void main(String args[])
    {
        int a[]=new int[10];
        int b[]=new int[10];
        int c[]=new int[10];
        int count=0,n,m,i;
        Scanner in=new Scanner(System.in);
        System.out.println("enter the size of first array");
        n=in.nextInt();
        System.out.println("enter the elements of first array");
        for(i=0;i<n;i++)
            a[i]=in.nextInt();
        System.out.println("enter the size of second array");
        m=in.nextInt();
        System.out.println("enter the elements of second array");
        for(i=0;i<m;i++)
            b[i]=in.nextInt();
        for(i=0;i<n;i++)
        {
            c[i]=a[i];
            count++;
        }
        for(i=0;i<m;i++)
        c[count++]=b[i];
        System.out.println("merged array");
        for(i=0;i<m+n;i++)
        System.out.println(c[i]+"");
    }
}