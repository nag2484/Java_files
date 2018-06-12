class Demo
{
  public static void main()
  {
    System.out.println("Non returning method");
  }

  public static void main(int arg)
  {
    System.out.println("Returning int type");
  }

  public static void main(int arg, double arg1)
  {
    System.out.println("Returning int and double type");
  }

  public static void main(int arg, double arg2, int arg3)
  {
    System.out.println("Returning 3 arguments");
  }

  public static void main(String[] args)
  {
    System.out.println("String array args method");
  }

}

class Main_Method_Overloading
{
  public static void main(String[] args)
  {
    System.out.println("Main method started");

    String str[]={"Hello","Hi"};

    Demo.main();
    Demo.main(10);
    Demo.main(10,30.8);
    Demo.main(20,39.8,2);
    Demo.main(str);

    System.out.println("Main method ended");

  }
}
