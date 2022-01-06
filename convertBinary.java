import java.io.*;
import java.util.*;
class base
{
    public void convertBinary(int num)
    {
        int binary[]=new int[40];
        int in=0;
        while(num>0)
        {
            binary[in++]=num%2;
            num=num/2;
        }
        System.out.println("binary");
        for(int i=in-1;i>=0;i--)
        {
            System.out.println(binary[i]);
        }
        System.out.println("");
    }
    public void convertoctal(int num)
    {
        int octal[]=new int[40];
        int x=num,i=0;
        while(x!=0)
        {
            octal[i++]=x%8;
            x=x/8;
        }
        System.out.println("octal");
        for(int j=i-1;j>0;j--)
        System.out.println(octal[j]);
    }
    public void converthexa(int n)
    {
        char hexa[]=new char[100];
        int i=0;
        while(n!=0)
        {
            int temp=0;
            temp=n%16;
            if(temp<10)
            {
                hexa[i]=(char)(temp+48);
                i++;
            }
            else
            {
                hexa[i]=(char)(temp+55);
                i++;
            }
            n=n/16;
        }
        System.out.println("hexadecimal");
        for(int j=i-1;j>=0;j--)
        System.out.println(hexa[j]);
    }
}
class convertBinary
{
    public static void main(String args[])
    {
        base obj=new base();
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a decimal number");
        n=sc.nextInt();
        obj.convertBinary(n);
        obj.convertoctal(n);
        obj.converthexa(n);
    }
}
