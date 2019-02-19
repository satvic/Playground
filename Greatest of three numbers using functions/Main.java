import java.util.Scanner;
class Main{
  
    public static int great(int a, int b)
    {
      if (a > b)
        return a;
      else
        return b;
    }
       
	public static void main (String[] args)
    {
      Scanner in = new Scanner(System.in);
      int n1 = in.nextInt();
      int n2 = in.nextInt();
      int n3 = in.nextInt();
      int large = great(n1,n2);
      int result = great(large,n3);
      System.out.print(result);
	}
}