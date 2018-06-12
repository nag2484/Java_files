class User_Def_Const
{
  int x;
  int y;

  User_Def_Const()
  {
    System.out.println("Running no arg constructer");
    x=10;
    y=20;

  }

}

class Main
{
  public static void main(String[] args)
  {
    User_Def_Const ud = new User_Def_Const();
    System.out.println("Instance 1 members");

    System.out.println("X = " + ud.x);
    System.out.println("Y = " + ud.y);

    User_Def_Const ud1 = new User_Def_Const();
    System.out.println("Instance 2 members");

    System.out.println("X = " + ud1.x);
    System.out.println("Y = " + ud1.y);
  }
}
