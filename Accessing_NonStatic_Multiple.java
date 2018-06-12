class Non_Static
{
  int x = 80;
  int y = 60;

  void nonStatic()
  {
    System.out.println("Non Static Function executed ");
  }
}


class Accessing_NonStatic_Multiple
{
  public static void main(String[] args)
  {

    Non_Static nonStat = new Non_Static();

    System.out.println("First Object X = " + nonStat.x);
    System.out.println("First Object Y = " + nonStat.y);
    nonStat.nonStatic();

    Non_Static nonStat2 = new Non_Static();

    System.out.println("Second Object X = " + nonStat2.x);
    System.out.println("Second Object Y = " + nonStat2.y);
    nonStat2.nonStatic();

  }

}
