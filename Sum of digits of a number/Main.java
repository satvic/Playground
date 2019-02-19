import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    
      Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      int digits = 0, sum = 0,a = 0 , b = 0, c = 0 , d = 0, e =  0;
      int temp = n;
      
      while (temp != 0)
      { 
          temp = temp/10;
          digits++;
      }
      
      if (digits == 5)
      { 
        a=n/10000;
        e=n%10;
        b=(n/1000)%10;
        d=(n%100)/10;
        c=(n%1000)/100;
        sum = a+b+c+d+e;
        
      } 
       else if (digits == 3)
       { 
         a = n/100;
         c = n%10;
         b = (n%100)/10;
         sum = a+b+c;
         
       } System.out.println(sum);
    } 
}
         
         