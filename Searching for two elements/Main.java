import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
      Scanner in = new Scanner(System.in);
      int size = in.nextInt();
      int arr[] = new int[size];
      int in1 = -1, in2 = -1;
      for(int i = 0; i < size; i++)
      {
        arr[i] = in.nextInt();
      }
      int a = in.nextInt();
      int b = in.nextInt();
      for(int j = 0; j < size; j++)
      {
        if(arr[j] == a)
        in1 = j;
        
      }
      for (int k = 0; k < size; k++)
      { 
        if(arr[k] == b)
        in2 = k;
      }
      
      System.out.println(in1);
      System.out.println(in2);
      
}
}