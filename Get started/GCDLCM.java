import java.util.*;
    
    public class Main{
    
// 1. You are required to print the Greatest Common Divisor (GCD) of two numbers.
// 2. You are also required to print the Lowest Common Multiple (LCM) of the same numbers.
// 3. Take input "num1" and "num2" as the two numbers.
// 4. Print their GCD and LCM.

    
    public static void main(String[] args) {
      // write your code here  
      Scanner s=new Scanner(System.in);
      int num1=s.nextInt();
      int num2=s.nextInt();
      
      int div=num1;
      int dvd=num2;
      
      while(dvd%div!=0){
          int rem=dvd%div;
          dvd=div;
          div=rem;
      }
      int gcd=div;
      int lcm=(num1*num2)/gcd;
      
      System.out.println(gcd);
      System.out.println(lcm);
     }
    }