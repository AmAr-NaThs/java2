import java.io.*;
import java.util.*;
class fib
{
    public static void main (String args[])
    {
        Scanner sc=new Scanner(System.in);
        int f1=1,f2=1,f3=0,n;
        System.out.println("enter the limit: ");
        n=sc.nextInt();
        System.out.println("The series is : ");
        System.out.println(f1);
        System.out.println(f2);
        while((f1+f2)<n)
        {
            f3=f1+f2;
            System.out.println(f3);
            f1=f2;
            f2=f3;
        }
    }
}