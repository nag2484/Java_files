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

class Child1 extends Test
{
  int z1 = 30;
  void m3()
  {
    System.out.println("M3 Executed");
  }

}

class Child2 extends Test
{
  int z2 = 40;
  void m4()
  {
    System.out.println("M3 Executed");
  }

}

class Child3 extends Test
{
  int z3 = 60;
  void m5()
  {
    System.out.println("M3 Executed");
  }

}

class Inherit_Hybrid
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

    Child1 c1 = new Child1();
    System.out.println("Z Value in Child: "+ c1.z1);
    c1.m3();
    System.out.println("Y Value in Test inherited by Child: "+ c1.y);
    c1.m2();
    System.out.println("X Value in Demo inherited by Child: "+ c1.x);
    c1.m1();

    Child2 c2 = new Child2();
    System.out.println("Z Value in Child: "+ c2.z2);
    c2.m4();
    System.out.println("Y Value in Test inherited by Child: "+ c2.y);
    c2.m2();
    System.out.println("X Value in Demo inherited by Child: "+ c2.x);
    c2.m1();

    Child3 c3 = new Child3();
    System.out.println("Z Value in Child: "+ c3.z3);
    c3.m5();
    System.out.println("Y Value in Test inherited by Child: "+ c3.y);
    c3.m2();
    System.out.println("X Value in Demo inherited by Child: "+ c3.x);
    c3.m1();

  }
}
