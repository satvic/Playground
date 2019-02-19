import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    
      Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      int digits = 0, num = 0;
      int temp = n;
      
      while (temp != 0)
      { 
          temp = temp/10;
          digits++;
      }
      
      if (digits == 5)
          num = (n/1000)%10;
      
       else if (digits == 2)
           num = n%10;
      
         
      System.out.println(num);
   
    }
}