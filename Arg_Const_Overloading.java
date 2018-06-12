class Arg_Const
{
  int x;
  double y;

  Arg_Const()
  {
    x=40;
    y=50;
  }

  Arg_Const(int arg)
  {
    x = arg;

  }

  Arg_Const(double arg)
  {
    y = arg;
  }

  Arg_Const(int arg1,double arg2)
  {
    x = arg1;
    y = arg2;

  }

  Arg_Const(double arg1, int arg2)
  {
    y=arg1;
    x=arg2;

  }

}

class Arg_Const_Overloading
{
  public static void main(String[] args)
  {
    System.out.println("Passing No values to constructor");
    Arg_Const ag1 = new Arg_Const();
      System.out.println("X = " + ag1.x);
      System.out.println("Y = " + ag1.y);

    System.out.println("Passing only x value to constructor");
    Arg_Const ag2 = new Arg_Const(80);
      System.out.println("X = " + ag2.x);
      System.out.println("Y = " + ag2.y);

    System.out.println("Passing only y value to constructor");
    Arg_Const ag3 = new Arg_Const(66.99);
      System.out.println("X = " + ag3.x);
      System.out.println("Y = " + ag3.y);

    System.out.println("Passing x and y values to constructor");
    Arg_Const ag4 = new Arg_Const(90,99.99);
      System.out.println("X = " + ag4.x);
      System.out.println("Y = " + ag4.y);

    System.out.println("Passing y and x values to constructor");
    Arg_Const ag5 = new Arg_Const(56.54,88);
      System.out.println("X = " + ag5.x);
      System.out.println("Y = " + ag5.y);
  }

}
