class Discount_Nested
{
  public static void main (String[] args)
  {
    double totalAmt =  0;
    int quantity = 100;
    double price = 30.00;
    double discount = 0;

    totalAmt = quantity*price;
     System.out.println("Total amount before discount is : " + totalAmt);
    if(quantity >= 70 && quantity < 80)
    {
      //discount = totalAmt/10;
      //totalAmt = totalAmt - discount;
      totalAmt = totalAmt - ((totalAmt*10)/100);

      System.out.println("Total amount after discount is : " + totalAmt);
    }
    else if(quantity >= 80 && quantity < 100)
    {
      //discount = totalAmt/15;
      //totalAmt = totalAmt - discount;
      totalAmt = totalAmt - ((totalAmt*15)/100);
      System.out.println("Total amount after discount is : " + totalAmt);
    }
    else if(quantity >= 100)
    {
      discount = (totalAmt*20)/100;
      totalAmt = totalAmt - discount;
      //totalAmt = totalAmt - ((totalAmt*20)/100);
      System.out.println("Total amount after discount is : " + totalAmt);
    }
    else
    {
      //discount = totalAmt/5;
      //totalAmt = totalAmt - discount;
      totalAmt = totalAmt - ((totalAmt*5)/100);
      System.out.println("Total amount after discount is : " + totalAmt);
    }
  }
}
