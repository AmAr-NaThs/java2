import java.io.*;
import java.util.*;
import java.lang.*;
class triangle
{
    public static void main(String args[])
    {
        int sum=0,large;
        double area,t=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter sides of triangle");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        if(a>b)
        {
            if(a>c)
            {
                sum=b+c;
                large=a;
            }
            else
            {
                sum=a+b;
                large=c;
            }
        }
        else if(b>c)
        {
            sum=a+c;
            large=b;
        }
        else
        {
            sum=a+b;
            large=c;
        }
        if(sum>large)
        {
            System.out.println("the triangle is valid");
            if(a==b&&b==c&&a==c)
            {
                System.out.println("the triangle is equilateral");
                area=((Math.sqrt(3))*((a*a)/4));
                System.out.println("area="+area);
            }
            else if(a==b||b==c||a==c)
            {
                System.out.println("the tringle is isosceles");
                area=((b*(Math.sqrt(4*a*a)))-(b*b))/4;
                System.out.println("area="+area);
            }
            else
            {
                System.out.println("the tringle is scalene");
                t=(a+b+c)/2;
                area=Math.sqrt(t*(t-a)*(t-b)*(t-c));
                System.out.println("area="+area);
            }
        }
        else
        {
            System.out.println("the triangle is invalid");
        }
    }
}