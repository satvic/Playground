import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner in = new Scanner(System.in);
    int size = in.nextInt();
    int list[] = new int[size];
    int max = list[0];
    int index = 0;
    for (int i = 0; i <= size-1; i++)
    {
      list[i] = in.nextInt();
    }
    for (int j = 0; j <= size-1; j++)
    {
      if (max < list[j])
      {
        max = list[j];
        index = j;
      }
    }
    System.out.println(index);
    
  }
}