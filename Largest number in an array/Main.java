import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
      Scanner in =  new Scanner(System.in);
      int size = in.nextInt();
      int arr[] = new int[size];
      int temp = 0;
      
      for(int i = 0; i < size; i++)
      {
        arr[i] = in.nextInt();
      }
      
      for(int j = 0; j < size-1; j++)
      {
        if (arr[j] > arr[j+1])
        {
          temp = arr[j];
          arr[j] = arr[j+1];
          arr[j+1] = temp;
        }
      }
      System.out.println(arr[size-1]);
  }
}