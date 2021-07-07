import java.util.*;
  
// Question:
// 1. You are given a base b.
// 2. You are given two numbers n1 and n2 of base b.
// 3. You are required to subtract n1 from n2 and print the value.

// Input Format:
// A base b
// A number n1
// A number n2

// Output Format:
// A number of base b equal in value to n2 - n1.

// Constraints:
// 2 <= b <= 10
// 0 <= n1 <= 256
// n1 <= n2 <= 256

// Sample Input:
// 8
// 1
// 100

// Sample Output:
// 77

  public class Main{
  
  public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
      int b = scn.nextInt();
      int n1 = scn.nextInt();
      int n2 = scn.nextInt();
  
      int d = getDifference(b, n1, n2);
      System.out.println(d);
   }
  
   public static int getDifference(int b, int n1, int n2){
       // write your code here
      
       int ans=0;
        int bor=0;
       int p=1;
       
       while( n2>0 ){
           int d1=n1%10;
           int d2=n2%10;
           n1=n1/10;
           n2=n2/10;
           
           int d=0;
           d2=d2+bor;
           
           if(d2>=d1){
               bor=0;
               d=d2-d1;
           }else{
               bor=-1;
               d=d2+b-d1;
           }
           ans=ans+d*p;
           p=p*10;
           
       }
       return ans;
   }
  
  }