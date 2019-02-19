import java.util.Scanner;
class Main{
  
    public static int gcd(int a, int b)
    {
      int gcd = 1; 
     for(int i = 1; i <= a && i <= b; ++i)
        {
           if(a % i==0 && b % i==0)
           gcd = i;
        }
      return gcd;
    }
       
	public static void main (String[] args)
    {
      Scanner in = new Scanner(System.in);
      int n1 = in.nextInt();
      int n2 = in.nextInt();
      int n3 = in.nextInt();
      int result = gcd(n1,n2);
      int result1 = gcd(result,n3);
      System.out.print(result1);
	}
}