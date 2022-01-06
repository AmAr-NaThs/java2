import java.io.*;
import java.util.*;
class student
{
    int m1,m2,m3,m4,m5,total,f=0;
    public student(int m1,int m2,int m3,int m4,int m5)
    {
        this.m1=m1;
        this.m2=m2;
        this.m3=m3;
        this.m4=m4;
        this.m5=m5;
    } 
    int calc()
    {
        if(m1>50)
        {
            if(m2>50)
            {
                if(m3>50)
                {
                    if(m4>50)
                    {
                        if(m5>50)
                        {
                            total=m1+m2+m3+m4+m5;
                        }
                    }
                    else
                    {
                        total=0;
                    }
                }
            }
        }
        return total;
    }
}
class mark
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the 5 marks");
        int m1,m2,m3,m4,m5,total;
        m1=sc.nextInt();
        m2=sc.nextInt();
        m3=sc.nextInt();
        m4=sc.nextInt();
        m5=sc.nextInt();
        student s=new student(m1,m2,m3,m4,m5);
        total=s.calc();
        float avg=total/5;
        if(total==0)
        {
            System.out.println("student failed");
        }
        else
        {
            System.out.println("student passed\nTotal= "+total+"\naverage= "+avg);
        }
    }
}