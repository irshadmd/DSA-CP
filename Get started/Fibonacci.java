import java.util.*;

// 1. You've to print first n fibonacci numbers.
// 2. Take as input "n", the count of fibonacci numbers to print.
// 3. Print first n fibonacci numbers.
  
  public class Main{
  
  public static void main(String[] args) {
      // write your code here
      Scanner s=new Scanner(System.in);
      int n=s.nextInt();
      
      int a=0;
      int b=1;
      
      int i=0;
      while(i<n){
          int c=a+b;
          System.out.println(a);
          a=b;
          b=c;
          i++;
      }
   }
  }