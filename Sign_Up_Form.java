class Sign_Up
{
  String firstName;
  String lastName;
  String emailId;
  String address;
  int zipCode;
  int phoneNum;
  String password;
  String confirmPwd;



  Sign_Up(String fName,String lName, String email, String addr, int zip, int phNum, String pwd, String conPwd)
  {
    firstName = fName;
    lastName = lName;
    emailId = email;
    address = addr;
    zipCode = zip;
    phoneNum = phNum;
    password = pwd;
    confirmPwd = conPwd;

    if(pwd == conPwd )
    {
      System.out.println("First Name : " + firstName);
      System.out.println("Last Name : " + lastName);
      System.out.println("Address : " + address);
      System.out.println("Email Id : " + emailId);
      System.out.println("Phone Number: " + phoneNum);
      System.out.println("Zip Code : " + zipCode);

      System.out.println("You have registered successfully.");
    }
    else
    {
      System.out.println("Password and Confirm Password are not same.");
    }
  }
  Sign_Up(String fName,String lName)
  {
    firstName = fName;
    lastName = lName;

    System.out.println("First Name, Last Name, Email , Password and Confirm Password are Mandatory");
  }

  Sign_Up(String fName,String lName, String email)
  {
    firstName = fName;
    lastName = lName;
    emailId = email;

    System.out.println("First Name, Last Name, Email , Password and Confirm Password fields are Mandatory");
  }

  Sign_Up(String fName,String lName, String email, String addr)
  {
    firstName = fName;
    lastName = lName;
    emailId = email;
    address = addr;

    System.out.println("First Name, Last Name, Email , Password and Confirm Password fields are Mandatory");
  }

  Sign_Up(String fName,String lName, String email, String addr, int zip)
  {
    firstName = fName;
    lastName = lName;
    emailId = email;
    address = addr;
    zipCode = zip;


    System.out.println("First Name, Last Name, Email , Password and Confirm Password fields are Mandatory");
  }

  Sign_Up(String fName,String lName, String email, String addr, int zip, int phNum)
  {
    firstName = fName;
    lastName = lName;
    emailId = email;
    address = addr;
    zipCode = zip;
    phoneNum = phNum;

    System.out.println("First Name, Last Name, Email , Password and Confirm Password fields are Mandatory");
  }

  Sign_Up(String fName,String lName, String email, String addr, int zip, int phNum, String pwd)
  {
    firstName = fName;
    lastName = lName;
    emailId = email;
    address = addr;
    zipCode = zip;
    phoneNum = phNum;
    password = pwd;

    System.out.println("First Name, Last Name, Email , Password and Confirm Password fields are Mandatory");
  }


}



class Sign_Up_Form
{
  public static void main(String[] args)
  {
    Sign_Up sup = new Sign_Up("Clad","Harry","abc@123.com","23, South ave", 44567,665478,"abc@123","abc@12");
  }

}
