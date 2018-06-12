//Java program to read the value of an integer m and display the value of n is 1 when m is larger than 0, 0 when m is 0 and -1 when m is less than 0.
class Int_Display
{
  public static void main(String[] args)
  {
    int m = 20;
    int n = 0;

    if(m > 0)
    {
      n = 1;
      System.out.println("Value of n is : " + n);
    }
    else if(m == 0)
    {
      n = 0;
      System.out.println("Value of n is : " + n);
    }
    else
    {
      n = -1;
      System.out.println("Value of n is : " + n);
    }

  }

}
