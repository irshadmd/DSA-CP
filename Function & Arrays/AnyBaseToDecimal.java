import java.util.*;
  

// Question
// 1. You are given a number n.
// 2. You are given a base b. n is a number on base b.
// 3. You are required to convert the number n into its corresponding value in decimal number system.

//   Sample Input
// 111001
// 2

// Sample Output
// 57

  public class Main{
  
  public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
      int n = scn.nextInt();
      int b = scn.nextInt();
      int d = getValueIndecimal(n, b);
      System.out.println(d);
   }
  
   public static int getValueIndecimal(int n, int b){
      // write your code here
      
      int ans=0;
      int i=0;
      while(n!=0){
          int digit=n%10;
          ans+=digit*(int)Math.pow(b,i);
          n=n/10;
          i++;
      }
      return ans;
   }
  }