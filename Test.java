class Test
{
    static int noObject=0;
    {
        noObject+=1;
    }
    public Test()
    {

    }
     public Test(int n)
     {

     }
     public Test(String s)
     {
         
     }
     public static void main(String args[])
     {
         Test t1=new Test();
         Test t2=new Test(5);
         Test t3=new Test("anu");
         System.out.println(Test.noObject);
     }
}