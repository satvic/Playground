import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    Scanner in = new Scanner(System.in);
        int n = in.nextInt();
      int num = 0;
        for (int k = n ; k >= 1; k--)
          {  
            num = k; 
          for (int l = 1; l<= k; l++)
               { 
                 System.out.print(num);
                 num = num - 1;
               }
          System.out.print("\n");
                 }
}
}