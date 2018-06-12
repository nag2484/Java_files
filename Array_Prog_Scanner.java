import java.util.Scanner;

class Array_Prog_Scanner
{
  public static void main(String[] args)
  {
    int[] arry = new int[5];

    Scanner sc = new Scanner(System.in);

    System.out.println("Enter "+arry.length+" int array elements");
    for(int i=0; i<5;i++)
    {
      arry[i] = sc.nextInt();

    }

    System.out.println("Array Elements are : ");
    for(int i=0; i<5;i++)
    {
      System.out.println(arry[i]);
    }
  }
}
