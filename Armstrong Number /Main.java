import java.util.Scanner;
class Main{
	public static void main (String[] args){
      Scanner in = new Scanner(System.in);
      int num = in.nextInt();
      int num1 = 0, num2 = 0, num3 = 0;
     
      num1 = num/100;
      num2 = (num/10)%10;
      num3 = num%10;
       
      
      
      for (int i = 1, temp1 = num1; i < 3; i++)
      {         
        num1 = temp1*num1;
      }
      
      for (int i = 1, temp2 = num2; i < 3; i++)
      {         
        num2 = temp2*num2;
      }
      
      for (int i = 1, temp3 = num3; i < 3; i++)
      {         
        num3 = temp3*num3;
      }
        int sum = num1 + num2 + num3;
      
	    if (sum == num)
          System.out.println("Armstrong Number");
        else 
          System.out.println("Not a Armstrong Number");
         
	}
}