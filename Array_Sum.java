import java.util.Scanner;

public class Array_Sum
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
      int sum = 0;
      System.out.println("Enter int Array elements");

      for (int i=0; i<intArr.length;i++)
      {
         intArr[i]= sc.nextInt();

      }
      for (int i=0;i<intArr.length;i++)
      {
        sum = sum+intArr[i];
      }
      System.out.println("Sum of an array : " +sum);

     }
}
