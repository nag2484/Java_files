class Non_Static
{
  int x = 80;
  int y = 60;

  void nonStatic()
  {
    System.out.println("Non Static Function executed ");
  }
}


class Accessing_Multiple_Object_Assignment
{
  public static void main(String[] args)
  {

    Non_Static nonStat = new Non_Static();
    Non_Static nonStat2  , nonStat3;
    nonStat2 = nonStat;
    nonStat3 = nonStat;

    System.out.println("First Object X = " + nonStat.x);
    System.out.println("First Object Y = " + nonStat.y);
    nonStat.nonStatic();

    System.out.println("Second Object X = " + nonStat2.x);
    System.out.println("Second Object Y = " + nonStat2.y);
    nonStat2.nonStatic();

    System.out.println("Second Object X = " + nonStat3.x);
    System.out.println("Second Object Y = " + nonStat3.y);
    nonStat3.nonStatic();

    nonStat.x = 30;
    nonStat.y = 50;

    System.out.println("########################################");
    System.out.println("Reassinging value to first object.");

    System.out.println("First Object X = " + nonStat.x);
    System.out.println("First Object Y = " + nonStat.y);
    nonStat.nonStatic();

    System.out.println("Second Object X = " + nonStat2.x);
    System.out.println("Second Object Y = " + nonStat2.y);
    nonStat2.nonStatic();

    System.out.println("Second Object X = " + nonStat3.x);
    System.out.println("Second Object Y = " + nonStat3.y);
    nonStat3.nonStatic();



  }

}
