import java.util.Scanner;
class Main {
	public static void main (String[] args)
   {
      Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      for(int row = 0; row < n; row++)
       {
         for(int col = 0; col < n; col++)
         {
           if (row == 0 || row == n-1)
             System.out.print("*");
           else if (col== 0 || col == n-1)
             System.out.print("*");
           else
             System.out.print(" ");
         }
        System.out.print("\n");
      }
    }
}