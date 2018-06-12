class Non_Static
{
  int x = 80;
  int y = 60;

  void nonStatic()
  {
    System.out.println("Non Static Function executed ");
  }
}

class Static_Mem
{
  static int x = 50;
  static int y = 90;

  static void StaticFun()
  {
    System.out.println("Static Function executed ");
  }
}

class Accessing_Static_NonStatic
{
  public static void main(String[] args)
  {
    System.out.println("Static X = "+ Static_Mem.x);
    System.out.println("Static Y = " + Static_Mem.y);
    Static_Mem.StaticFun();

    Non_Static nonStat = new Non_Static();

    System.out.println("Static X = " + nonStat.x);
    System.out.println("Static Y = " + nonStat.y);
    nonStat.nonStatic();
  }

}
