import java.util.*;
import java.io.*;
class factorial
{
  public static void main(String args[])
  {
     factorial f=new factorial();
     Scanner s=new Scanner(System.in);
     System.out.println("Enter the number");
     int n=s.nextInt();
     int fact=1,i=1;
     while(i<=n)
    {
        fact=fact*i;
        i++;
     }
     System.out.println("The given factorial number"+fact);
    }
}