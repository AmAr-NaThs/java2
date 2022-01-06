import java.io.*;
import java.util.*;
class command
{
    public static void main(String args[])
    {
        double sum,diff,pro,quo,rem;
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the first number: ");
        int a= sc.nextInt();
        System.out.println("enter the second number: ");
        int b= sc.nextInt();
        sum=a+b;
        diff=a-b;
        pro=a*b;
        quo=a/b;
        rem=a%b;
        System.out.println("sum="+sum+"\ndifference="+diff+"\nproduct="+pro+"\nquotient="+quo+"\nremainder="+rem);
    }
}