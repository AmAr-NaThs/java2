import java.io.*;
import java.util.*;
class number
{
    void sumdigit(int num)
    {
        int sum=0;
        while(num!=0)
        {
            sum=sum+(num%10);
            num=num/10;
        }
        System.out.println("sum of digits="+sum);
    }
    void reverse(int num)
    {
        int rev=0,r;
        while(num!=0)
        {
            r=num%10;
            rev=(rev*10)+r;
            num=num/10;
        }
        System.out.println("reverse"+rev);
    }
}
class sumreverse
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("\nenter a number");
        int x=sc.nextInt();
        number n=new number();
        n.sumdigit(x);
        n.reverse(x);
    }
}