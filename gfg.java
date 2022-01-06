import java.util.*;
class Complex
{
    int real,imaginary;
    Complex()
    {

    }
    Complex(int tempreal,int tempimaginary)
    {
        real=tempreal;
        imaginary=tempimaginary;
    }
    Complex addComp(Complex C1,Complex C2)
    {
        Complex temp=new Complex();
        temp.real=C1.real+C2.real;
        temp.imaginary=C1.imaginary+C2.imaginary;
        return temp;
    }
}
class gfg
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        System.out.println("enter the real and imaginary part of the number");
        int r1=in.nextInt();
        int i1=in.nextInt();
        Complex C1=new Complex(r1,i1);
        System.out.println("complex number 1:  "+r1+"+i"+i1);
        System.out.println("enter the real and imaginary part of the second number");
        int r2=in.nextInt();
        int i2=in.nextInt();
        Complex C2=new Complex(r2,i2);
        System.out.println("complex number 2:  "+r2+"+i"+i2);
        Complex C3=new Complex();
        C3=C3.addComp(C1,C2);
        System.out.println("sum of two complex numbers:"+C3.real+"+i"+C3.imaginary);
    }
}