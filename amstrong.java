import java.io.*;
import java.util.*;
class amstrong
{
    public static void main(String args[])
    {
        int l,u,temp,i,a,r;
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the lower limit: ");
        l=sc.nextInt();
        System.out.print("enter the upper limit: ");
        u=sc.nextInt();
        sc.close();
        System.out.println("Amstrong numbers");
        for(i=l+1;i<u;i++)
        {
            a=0;
            temp=i;
            while(temp!=0)
            {
                r=temp%10;
                a=a+(r*r*r);
                temp=temp/10;
            }
            if(a==i)
            {
            System.out.println(i);
            }
        }
    }
}