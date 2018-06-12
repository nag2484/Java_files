class Customer_Details
{
  String name;
  String address;
  int phone_Num;
  double total_Amt;

  Customer_Details(String name1, String add1)
  {
    System.out.println("Printing Name and Address");
    name = name1;
    address = add1;
  }

  Customer_Details(String name1, String add1, int ph_num)
  {
    System.out.println("Printing Name, Address and Phone Number");
    name = name1;
    address = add1;
    phone_Num = ph_num;
  }

  Customer_Details(String name1, String add1, int ph_num, double amt)
  {
    System.out.println("Printing Name, Address, Phone Number and Total Amount");
    name = name1;
    address = add1;
    phone_Num = ph_num;
    total_Amt = amt;
  }

}

class Shopping
{
  public static void main(String[] args)
  {
    Customer_Details cd1 = new Customer_Details("Cindy" , "South Ave");
      System.out.println("Customer Name :  " + cd1.name);
      System.out.println("Address :  " + cd1.address);
      System.out.println("Phone Number :  " + cd1.phone_Num);
      System.out.println("Total Amount :  " + cd1.total_Amt);

    Customer_Details cd2 = new Customer_Details("John","22 Ave", 87790987);
      System.out.println("Customer Name :  " + cd2.name);
      System.out.println("Address :  " + cd2.address);
      System.out.println("Phone Number :  " + cd2.phone_Num);
      System.out.println("Total Amount :  " + cd2.total_Amt);

    Customer_Details cd3 = new Customer_Details("Winston" , "54 Street",6678765, 6987.87);
      System.out.println("Customer Name :  " + cd3.name);
      System.out.println("Address :  " + cd3.address);
      System.out.println("Phone Number :  " + cd3.phone_Num);
      System.out.println("Total Amount :  " + cd3.total_Amt);

  }

}
