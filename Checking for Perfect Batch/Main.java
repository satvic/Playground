import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner in = new Scanner(System.in);
    int size = in.nextInt();
    int list[] = new int[size];
    int div = size/3;
    int sum = 0;
    for (int i = 0; i <= size-1; i++)
    {
      list[i] = in.nextInt();
    }
    for (int j = 0; j <= size -1; j = j+3)
    {
      sum = sum + list[j] + list[j+1] + list[j+2];
    }
    
    if (sum % div == 0)
       System.out.println("Perfect Batch");
    else
      System.out.println("Not a Perfect Batch");
  }
}
    
    