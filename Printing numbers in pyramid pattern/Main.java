import java.util.Scanner;
class Main{
	public static void main (String[] args){
    	Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int num = 0;
        for (int k = 1 ; k <= n; ++k)
          {  
            
          for (int i = 1; i <= n-k; i++)
          {
            System.out.print(" ");
          }
          for (int l = 1; l<= k; l++)
               { 
                 num = num + 1;
                 System.out.print(num + " ");
                 
               }
          System.out.print("\n");
                 }
    }    
}