import java.util.*;
class Time
{
    int hh,mm,ss;
    Time(int hh,int mm,int ss)
    {
        this.hh=hh;
        this.mm=mm;
        this.ss=ss;
    }
    Time(Time T1,Time T2)
    {
        Time temp=new Time(0,0,0);
        temp.hh=T1.hh+T2.hh;
        temp.mm=T1.mm+T2.mm;
        temp.ss=T1.ss+T2.ss;
        System.out.println("sum of two time intervel="+temp.hh+":"+temp.mm+":"+temp.ss);
    }
}
class mainclass
{
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the first time intrevel");
        int h1=sc.nextInt();
        int m1=sc.nextInt();
        int s1=sc.nextInt();
        System.out.println("enter the second time intervel");
        int h2=sc.nextInt();
        int m2=sc.nextInt();
        int s2=sc.nextInt();
        Time T1=new Time(h1,m1,s1);
        Time T2=new Time(h2,m2,s2);
        Time t=new Time(T1,T2);
    }
}