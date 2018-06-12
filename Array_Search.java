import java.util.Scanner;

public class Array_Search
{
    static Scanner sc= new Scanner(System.in);
     public static void main(String[] args)
     {
        System.out.println("Enter size of an Array: ");
        int size = sc.nextInt();
        dispArr(size);
        //int[] intArr = dispArr(size);
      //  copyArr(intArr);
     }

     public static void dispArr(int size)
     {
      int[] intArr = new int[size];
      int srchEle ;
      int searchEle=0;

      System.out.println("Enter int Array elements");

      for (int i=0; i<intArr.length;i++)
      {
         intArr[i]= sc.nextInt();

      }

      System.out.println("Enter an element to be searched:");
      srchEle = sc.nextInt();
      for (int i=0;i<intArr.length;i++)
      {
        if(srchEle == intArr[i])
        {
          searchEle = intArr[i];
        }

      }

      if(srchEle == searchEle)
      {
        System.out.println("Element found: "+ searchEle);
      }
      else
      {
        System.out.println("Element not found");
      }
    /*  System.out.println("The array elements are");

      for (int i=0;i<intArr.length;i++)
      {
         System.out.println (intArr[i]);

      }

      //return intArr;*/
     }

     /*public static void copyArr(int[] intArr)
     {
      int[] copArr = new int[intArr.length];
      System.out.println("Copy of Array");
      for(int i = 0;i<=intArr.length-1;i++)
      {
          copArr[i] = intArr[i];
          System.out.println(copArr[i]);
      }
     }*/

}
