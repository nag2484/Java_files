class Demo1
{
  static int x = 10;

  public static void m1()
  {
    System.out.println(" M1 Executed");

  }

}

class Demo2
{
  int x = 10;

  public void m2()
  {
    System.out.println(" M2 Executed");

  }

}

class Accessing_Statements
{
  public static void main(String[] args)
  {
    Demo1.x = 100;
    System.out.println("Main method started");
    System.out.println(Demo1.x);
    Demo1.m1();
    //System.out.println(Demo2.x);
    //Demo2.m2();

    System.out.println("Main method ended");

  }


}
