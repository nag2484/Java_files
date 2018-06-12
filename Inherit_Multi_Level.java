class Demo
{
  int x =10;
  void m1()
  {
    System.out.println("M1 Executed");
  }
}

class Test extends Demo
{
  int y =104;
  void m2()
  {
    System.out.println("M2 Executed");
  }
}

class Child extends Test
{
  int z = 30;
  void m3()
  {
    System.out.println("M3 Executed");
  }

}

class Inherit_Multi_Level
{
  public static void main(String[] args)
  {
    Demo d = new Demo();
    System.out.println("X Value in Demo: "+ d.x);
    d.m1();

    Test t = new Test();
    System.out.println("Y Value in Test: "+ t.y);
    t.m2();
    System.out.println("X Value in Demo inherited by Test: "+ t.x);
    t.m1();

    Child c = new Child();
    System.out.println("Z Value in Child: "+ c.z);
    c.m3();
    System.out.println("Y Value in Test inherited by Child: "+ c.y);
    c.m2();
    System.out.println("X Value in Demo inherited by Child: "+ c.x);
    c.m1();

  }
}
