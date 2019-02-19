import java.util.Scanner;
class Main {
	public static void main (String[] args)
   {
      Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      for(int row = 1; row <= n; row++)
       {
            if(row%2 == 0)
            {
              for (int count = 1; count <= n; count++)
             { 
              if (count == 1)
                System.out.print(row+1);
              else
                System.out.print(row);
            }
            }     
             else 
             {
               for (int count = 1; count <= n; count++)
            { 
              if (count == n)
                System.out.print(row+1);
              else
                System.out.print(row);
            }
             }
               
              
           System.out.print("\n");
           
         }
      }
    }

             
              
              
         