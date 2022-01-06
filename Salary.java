 import java.util.*;
class Employee
{
   double da,hra,pf,ns=0.00,al;
   String name,dep,des;
   int sal,id;
   void display()
   {
       Scanner sc=new Scanner(System.in);
       System.out.println("enter the name of employee");
       name=sc.next();
       System.out.println("enter employee id");
       id=sc.nextInt();
       System.out.println("enter Designation");
       des=sc.next();
       System.out.println("enter Department");
       dep=sc.next();
       System.out.println("enter the basic salary");
       sal=sc.nextInt();
   }
   void show()
   {
       System.out.println("--------------------------");
       System.out.println("Name              "+name);
       System.out.println("EmpID             "+id);
       System.out.println("Designation       "+des);
       System.out.println("Dept              "+dep);
       System.out.println("Net salary        "+ns);
       System.out.println("--------------------------");
   }
   void netsalary()
   {
       da=sal*1.1;
       hra=1250;
       pf=sal*.12;
       al=sal*.35;
       ns=sal+hra+da+al-pf;
       
   }
 
}
class Salary extends Employee
{
   public static void main(String args[])
   {
       Employee e=new Employee();
       e.display();
       System.out.println("employee details");
       e.netsalary();
       e.show();
   }
}