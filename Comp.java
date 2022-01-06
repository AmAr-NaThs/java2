import java.util.*;
interface Volume
{
   double pi=3.142;
   void readdata();
   void dispvolume();
 
}
class Sphere implements Volume
{
   float r;
   public void readdata()
   {
       System.out.println("enter the radius of sphere");
       Scanner sc=new Scanner(System.in);
       r=sc.nextFloat();
   }
   public void dispvolume()
   {
       double volume=(4/3)*pi*r*r*r;
       System.out.println("volume of sphere="+volume);
 
   }
}
class Cylinder implements Volume
{
   float r,h;
   public void readdata()
   {
       Scanner sc=new Scanner(System.in);
       System.out.println("enter the radius and height of the cylinder");
       r=sc.nextFloat();
       h=sc.nextFloat();
   }
   public void dispvolume()
   {
       double volume=pi*r*r*h;
       System.out.println("volume cylinder="+volume);
 
   }
 
}
class Comp
{
   public static void main(String args[])
   {
       Sphere obj1=new Sphere();
       Cylinder obj2=new Cylinder();
       Volume obj3;
       obj3=obj1;
       obj3.readdata();
       obj3.dispvolume();
       obj3=obj2;
       obj3.readdata();
       obj3.dispvolume();
  }
}
 