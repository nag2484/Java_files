class Demo
{
  int x = 20;
  int y = 70;

  void m1()
  {
    System.out.println("M1 got executed");
  }

}

class Accessing_Non_Static
{
  public static void main(String[] args)
  {
    Demo d = new Demo();
    System.out.println("X = " + d.x);
    System.out.println("Y = " + d.y);
    d.m1();
  }
}
