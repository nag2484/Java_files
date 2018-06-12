class ATM_Transaction
{
  public static void main(String[] args)
  {
    double amtBal = 5000.00;
    double amtWithDraw = 1000.00;

    if(amtBal>amtWithDraw)
    {
      amtBal = amtBal-amtWithDraw;
      System.out.println("Succesful");
      System.out.println("Amount Balance : " + amtBal);

    }
    else
    {
     System.out.println("Insuffcient Balance");
    }
  }
}
