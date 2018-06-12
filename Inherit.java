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

class Inherit
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

  }
}
