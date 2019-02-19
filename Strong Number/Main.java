import java.util.Scanner;
class Main{
	public static void main (String[] args){
        Scanner in =  new Scanner(System.in);
        int n = in.nextInt();
      int fact1 = 1, fact2 = 1,  fact3 = 1;
       int num1 = n/100;
       int num2 = (n/10)%10;
       int num3 = n%10;
      
        
        for (int i = 1 ; i <= num1; i++)
        fact1 = fact1 * i; 
      
      for (int i = 1 ; i <= num2; i++)
        fact2 = fact2 * i;
      
      for (int i = 1 ; i <= num3; i++)
        fact3 = fact3 * i;
      
      int sum = fact1 + fact2 + fact3;
      if (sum == n)
      System.out.println("Yes");
      else
        System.out.println("No");
      
          
        
     
    }
}
          