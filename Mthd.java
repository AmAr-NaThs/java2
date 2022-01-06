class Overload
{
   double volume(float l,float w,float h)
   {
       return l*w*h;
   }
   double volume(float l)
   {
       return l*l*l;
   }
   double volume(float r,float h)
   {
       return 3.1416*r*r*h;
   }
}
class Mthd
{
   public static void main(String args[])
   {
       Overload ol=new Overload();
       double rebox=ol.volume(5,8,9);
       System.out.println("volume of rectangularbox is "+rebox);
       System.out.println("");
       double cube=ol.volume(5);
       System.out.println("volume of cube is "+cube);
       System.out.println("");
       double cylinder=ol.volume(6,12);
       System.out.println("volume of cylinder is "+cylinder);
       System.out.println("");
   }
}
 