class User_Def_Const
{
  int x = 10;
  int y = 20;

  User_Def_Const(int arg1, int arg2)
  {
    System.out.println("Inside Construtor");

    x = arg1;
    y = arg2;
  }


}

class Arg_Const
{
  public static void main(String[] args)
  {
    User_Def_Const ud = new User_Def_Const(40,50);
    System.out.println("X =" + ud.x);
    System.out.println("Y = "+ud.y);

    User_Def_Const ud1 = new User_Def_Const(70,80);
    System.out.println("X =" + ud1.x);
    System.out.println("Y = " + ud1.y);

  }

}
