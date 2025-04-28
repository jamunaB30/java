class constructor
{
  String name="lisha";
  int age=23;
  constructor()
  {
     System.out.println("Default constructor is called");
  }
  constructor(String name)
  {
    this.name=name;
  }
  constructor(String name,int age)
  {
     this.name=name;
     this.age=age;
  }
  constructor(constructor c)
  {
     this.name=c.name;
     this.age=c.age;
  }
  
public static void main(String args[])
{
  constructor def=new constructor();
  constructor par=new constructor("jamuna");
  constructor par1=new constructor("yogi",18);
  constructor copy=new constructor(par1);
  System.out.println("Student name is"+def.name+"and age is"+def.age);
  System.out.println("Student name is"+par.name+"and age is"+par.age);
  System.out.println("Student name is"+par1.name+"and age is"+par1.age);
  System.out.println("Student name is"+copy.name+"and age is"+copy.age);
  }
}