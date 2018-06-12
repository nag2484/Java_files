import java.util.Scanner;

public class Array_Even_Odd
{
    static Scanner sc= new Scanner(System.in);
     public static void main(String[] args)
     {
        System.out.println("Enter size of an Array: ");
        int size = sc.nextInt();
        dispArr(size);

     }

     public static void dispArr(int size)
     {
      int[] intArr = new int[size];

      System.out.println("Enter int Array elements");

      for (int i=0; i<intArr.length;i++)
      {
         intArr[i]= sc.nextInt();

      }
      for (int i=0;i<intArr.length;i++)
      {
        if(intArr[i]%2 == 0)
        {
          System.out.println("Even Number in an array : " +intArr[i]);
        }
        else
        {
          System.out.println("Odd Number in an array : " +intArr[i]);
        }


      }

     }



}
