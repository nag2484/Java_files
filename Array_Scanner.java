import java.util.Scanner;

public class Array_Scanner
{
    static Scanner sc= new Scanner(System.in);
     public static void main(String[] args)
     {
        System.out.println("Enter size of an Array: ");
        int size = sc.nextInt();
        dispArr(size);

     }

     public static void dispArr(int Size)
     {
      int[] intArr = new int[Size];


      System.out.println("Enter int Array elements");

      for (int i=0; i<intArr.length;i++)
      {
         intArr[i]= sc.nextInt();
      }
      System.out.println("The array elements are");

      for (int i=0;i<4;i++)
      {
         System.out.println (intArr[i]);

      }

     }

}
