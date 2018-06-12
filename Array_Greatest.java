import java.util.Scanner;

public class Array_Greatest
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
      int greatest = 0;
      System.out.println("Enter int Array elements");

      for (int i=0; i<intArr.length;i++)
      {
         intArr[i]= sc.nextInt();

      }
      for (int i=0;i<intArr.length-1;i++)
      {
        if(intArr[i] > intArr[i+1])
        {
          greatest = intArr[i+1];
        }
        else
        {
          System.out.println("All array numbers are equal");
        }
      }
      System.out.println("Greatest number in an array : " +greatest);

     }



}
