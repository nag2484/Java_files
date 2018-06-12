import java.util.Scanner;



public class Array1



{



     public static void main(String[] args)



     {



        int[] intArr = new int[4];

        Scanner sc= new Scanner(System.in);

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
