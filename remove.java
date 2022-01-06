import java.io.*;
import java.util.*;
class remove
{
    public static void main(String args[])
    {
        String strong,strnew;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string");
        strong=sc.nextLine();
        strnew=strong.replaceAll("[aeiouAEIOU]","");
        System.out.println("vowel remove successfully and new string is");
        System.out.println(strnew);
    }
}