import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for (int k = 1; k <= n; k++)
          {
          for (int i = 1; i <= n-k; i++)
             System.out.print(" ");
          for (int j = 1; j <= (2*k)-1; j++)
             System.out.print("*");
             System.out.print("\n");
          }
            
           
}
}