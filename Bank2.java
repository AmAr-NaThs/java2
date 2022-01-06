import java.util.*;
class Minbalexp extends Exception
{
   Minbalexp(String msg)
   {
       super(msg);
   }
}
class Bank2
{
   public static void main(String args[])
   {
       Scanner in=new Scanner(System.in);
       int choice;
       float balance=0.f;
       try
       {
       do
       {
       System.out.println("enter your choice");
       System.out.println("1.Deposit money");
       System.out.println("2.Withdraw money");
       System.out.println("3.check balance");
       
       choice=in.nextInt();
   
       
   
       switch(choice)
       {
           case 1:float amount;
           System.out.println("Amount to deposit");
           amount=in.nextFloat();
           System.out.println(amount+"has been deposited");
           balance=balance+amount;
           break;
           case 2:System.out.println("Amount to withdraw");
           amount=in.nextFloat();
           if(amount>balance)
           throw new Minbalexp("can't withdraw");
           else
           {
               balance=balance-amount;
               System.out.println(amount+"has been withdraw");
           }
             break;
           case 3:System.out.println("your balance is"+balance);
           break;
       }
       }
 
       while(choice!=4);
       }
       catch(Minbalexp e)
       {
           System.out.println(e.getMessage());
       }
       
   }
}