import java.util.Scanner;
class evenodd
{
  public static void main(String args[])
  {
    evenodd l1=new evenodd();
    Scanner s=new Scanner(System.in);
    System.out.println("Enter the number:");
    int n=s.nextInt();
    if(n%2==0)
    System.out.println("the given number is even");
    else
    System.out.println("the given number is odd");
  }
}