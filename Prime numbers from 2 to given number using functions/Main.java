import java.util.Scanner;
class Main
{
  public static void prime(int num1)
  { 
    int flag;
    for (int i = 2; i <= num1; i++)
    { 
      flag = 1;
      for (int j = 2; j <= i/2; j++)
      {
        if (i%j == 0)
        { 
          flag = 0;
          break;
        }
      }
        if(flag == 1)
          System.out.println(i);
      }
    }
  
    
	public static void main (String[] args)
    {
	  Scanner in = new Scanner(System.in);
      int inp = in.nextInt();
      prime(inp);   
  
      
	}
}
