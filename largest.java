import java.util.Scanner;
public class largest
{
   void large(int a,int b,int c)
   {
      if(a>b && a>c)
        System.out.println("the largest number is"+a);
      else if(b>c)
        System.out.println("the largest number is"+b);
      else
         System.out.println("the largest number is"+c);
    }
    public static void main(String args[])
    {
        largest l=new largest();
        System.out.println("enter the 1 number");
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        System.out.println("enter the 2 number");
        int b=s.nextInt();
        System.out.println("enter the 3 number");
        int c=s.nextInt();
        l.large(a,b,c);
    }
}
