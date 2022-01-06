import java.io.*;
import java.lang.*;
class Odd extends Thread
{
   public void run()
   {
       for(int i=1;i<=10;i++)
       {
           if(i%2!=0)
           System.out.println("Thread1="+i);
       }
   }
}
class Even extends Thread
{
   public void run()
   {
       for(int i=1;i<=10;i++)
       {
           if(i%2==0)
           System.out.println("Thread2="+i);
       }
   }
}
class Oddeven
{
   public static void main( String args[])
   {
       Odd obj1=new Odd();
       Thread t1=new Thread(obj1);
       t1.setName("odd number thread started");
       t1.start();
       System.out.println(t1.getName());
       Even obj2=new Even();
       Thread t2=new Thread(obj2);
       t2.setName("even number thread started");
       t2.start();
       System.out.println(t2.getName());
       
   }
}
 