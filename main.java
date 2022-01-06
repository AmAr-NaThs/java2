class Shape
{
   void display()
   {
       System.out.println("Area of various shapes");
 
   }
}
abstract class TwoDim extends Shape
{
   final int a=10;
   final int b=20;
   final int h=5;
   abstract void squareArea();
   abstract void triangleArea();
}
class Square extends TwoDim
{
   void squareArea()
   {
       int area=a*a;
       System.out.println("Area of Square="+area);
   }
   void triangleArea()
   {
 
   }
}
class Triangle extends TwoDim
{
   void triangleArea()
   {
      double area=0.5*b*h;
      System.out.println("Area of Triangle="+area) ;
 
   }
   void squareArea()
   {
 
   }
}
abstract class ThreeDim extends Shape
{
   final int r=10;
   final int a=20;
   abstract void sphereArea();
   abstract void cubeArea();
}
class Sphere extends ThreeDim
{
   void sphereArea()
   {
       double area=4*3.14*r*r;
       System.out.println("Area of Sphere="+area);
 
   }
   void cubeArea()
   {
 
   }
}
class Cube extends ThreeDim
{
   void cubeArea()
   {
       int area=6*a*a;
       System.out.println("area of Cube="+area);
 
   }
   void sphereArea()
   {
 
   }
}
class main
{
   public static void main(String args[])
   {
       Shape s=new Shape();
       s.display();
       TwoDim q=new Square();
       q.squareArea();
       TwoDim t=new Triangle();
       t.triangleArea();
       ThreeDim p=new Sphere();
       p.sphereArea();
       ThreeDim c=new Cube();
       c.cubeArea();
   }
}