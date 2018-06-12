class Demo
{
  static void m1()
  {
    System.out.println("Non returning method");
  }

  static void m1(int arg)
  {
    System.out.println("Returning int type");
  }

  static void m1(int arg, double arg1)
  {
    System.out.println("Returning int and double type");
  }

  static void m1(int arg, double arg2, int arg3)
  {
    System.out.println("Returning 3 arguments");
  }

}

class Static_Method_Overloading
{
  public static void main(String[] args)
  {

    Demo.m1();
    Demo.m1(10);
    Demo.m1(10,30.8);
    Demo.m1(20,39.8,2);
  }
}
