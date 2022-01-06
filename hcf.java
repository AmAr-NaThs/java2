import java.util.*;
class hcf
{
    public static void main(String args[])
    {
        int a,b,x,y,t,hcf,lcm;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter two number");
        x=sc.nextInt();
        y=sc.nextInt();
        a=x;
        b=y;
        while(b!=0)
        {
            t=b;
            b=a%b;
            a=t;
        }
        hcf=a;
        lcm=(x*y)/hcf;
        System.out.println("HFC="+hcf);
        System.out.println("LCM="+lcm);
    }
}