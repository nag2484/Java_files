class Demo
{
  int x =10;
  void m1()
  {
    System.out.println("M1 Executed");
  }
}

class Child_1 extends Demo
{
  int y =104;
  void m2()
  {
    System.out.println("M2 Executed");
  }
}

class Child_2 extends Demo
{
  int z = 30;
  void m3()
  {
    System.out.println("M3 Executed");
  }

}

class Inherit_Hierarical
{
  public static void main(String[] args)
  {
    Demo d = new Demo();
    System.out.println("X Value in Demo: "+ d.x);
    d.m1();

    Child_1 c1 = new Child_1();
    System.out.println("Y Value in Child_1: "+ c1.y);
    c1.m2();
    System.out.println("X Value in Demo inherited by Child 1: "+ c1.x);
    c1.m1();

    Child_2 c2 = new Child_2();
    System.out.println("Z Value in Child_2: "+ c2.z);
    c2.m3();
    System.out.println("X Value in Demo inherited by Child2: "+ c2.x);
    c2.m1();

  }
}
