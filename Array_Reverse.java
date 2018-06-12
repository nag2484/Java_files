import java.util.Scanner;

public class Array_Reverse
{
    static Scanner sc= new Scanner(System.in);
     public static void main(String[] args)
     {
        System.out.println("Enter size of an Array: ");
        int size = sc.nextInt();
        //dispArr(size);
        int[] intArr = dispArr(size);
        revArr(intArr);
     }

     public static int[] dispArr(int size)
     {
      int[] intArr = new int[size];


      System.out.println("Enter int Array elements");

      for (int i=0; i<intArr.length;i++)
      {
         intArr[i]= sc.nextInt();
      }
      System.out.println("The array elements are");

      for (int i=0;i<intArr.length;i++)
      {
         System.out.println (intArr[i]);

      }

      return intArr;
     }

     public static void revArr(int[] intArr)
     {
      System.out.println("Reverse order of Array");
      for(int i = intArr.length-1;i>=0;i--)
      System.out.println(intArr[i]);
     }

}
