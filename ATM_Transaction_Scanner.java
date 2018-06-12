import java.util.Scanner;

class ATM_Transaction_Scanner
{
  public static void main(String[] args)
  {
    double amtBal = 5000.00;
    double amtWithDraw;
    int pin;

    Scanner sc= new Scanner(System.in);

    System.out.println("Enter ATM Pin: ");
    pin = sc.nextInt();

    if(pin == 1234)
    {
    System.out.println("Enter Amount to be withdraw: ");
    amtWithDraw = sc.nextDouble();

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
    else
    {
      System.out.println("Invalid Pin");
    }
  }
}
