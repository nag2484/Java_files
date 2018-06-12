class Demo
{
  void m1()
  {
    System.out.println("Non returning method");
  }

  void m1(int arg)
  {
    System.out.println("Returning int type");
  }

  void m1(int arg, double arg1)
  {
    System.out.println("Returning int and double type");
  }

  void m1(int arg, double arg2, int arg3)
  {
    System.out.println("Returning 3 arguments");
  }

}

class Method_Overloading
{
  public static void main(String[] args)
  {
    Demo d = new Demo();
    d.m1();
    d.m1(10);
    d.m1(10,30.8);
    d.m1(20,39.8,2);
  }
}
