import java.io.*;
import java.util.*;
class array
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a[]=new int[50];
        int max,min,n,temp,i,j;
        System.out.println("enter the size of the array ");
        n=sc.nextInt();
        System.out.println("enter the elements");
        for(i=0;i<n;i++)
        a[i]=sc.nextInt();
        for(i=0;i<n;i++)
        for(j=i+1;j<n;j++)
        {
            if(a[i]>a[j])
            {
                temp=a[i];
                a[i]=a[j];
                a[j]=temp;
            }
        }
        System.out.println("Largest element="+a[n-1]);
        System.out.println("Second largest element="+a[n-2]);
        System.out.println("Smallest element="+a[0]);
    }
}