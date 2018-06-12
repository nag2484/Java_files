class Array_Prog1
{
  public static void main(String[] args)
  {
    int[] arry = new int[5];

    System.out.println("Length of Array :  "+arry.length);
    for(int i=0; i<5;i++)
    {
      arry[i] = 100*i;
      System.out.println(arry[i]);
    }
  }
}
