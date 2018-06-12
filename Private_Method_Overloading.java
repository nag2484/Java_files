class Demo
{
  private static void m1()
  {
    System.out.println("Non returning method");
  }

  private static void m1(int arg)
  {
    System.out.println("Returning int type");
  }

  private static void m1(int arg, double arg1)
  {
    System.out.println("Returning int and double type");
  }

  private static void m1(int arg, double arg2, int arg3)
  {
    System.out.println("Returning 3 arguments");
  }

  private static void m1(String[] args)
  {
    System.out.println("String array args method");
  }

}

class Private_Method_Overloading
{
  public static void main(String[] args)
  {
    System.out.println("Main method started");

    String str[]={"Hello","Hi"};

    Demo.m1();
    Demo.m1(10);
    Demo.m1(10,30.8);
    Demo.m1(20,39.8,2);
    Demo.m1(str);

    System.out.println("Main method ended");

  }
}
