import java.io.*;
import java.util.*;
class variables
{
  String name;
  static int age=18;
  void setdata(String name,int age)
  {
     this.name=name;
     this.age=age;
  }
   void getdata()
  {
     int sem=4;
     System.out.println("Student name is"+name);
     System.out.println("Student age is"+age);
     System.out.println("Student sem is"+sem);
     System.out.println("****************************");
  }
  public static void main(String args[])
 {
   variables var=new variables();
   var.setdata("jamuna",16);
   var.getdata();
 }
}