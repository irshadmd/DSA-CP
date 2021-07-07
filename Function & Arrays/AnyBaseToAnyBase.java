import java.util.*;
  

//   Question:
// 1. You are given a number n.
// 2. You are given a base b1. n is a number on base b.
// 3. You are given another base b2.
// 4. You are required to convert the number n of base b1 to a number in base b2.

// Input Format:
// A number n
// A base b1
// A base b2

// Output Format:
// A number of base b2 equal in value to n of base b1

// Constraints:
// 0 <= n <= 512
// 2 <= b1 <= 10
// 2 <= b2 <= 10

// Sample Input:
// 111001
// 2
// 3

// Sample Output:
// 2010

  public class Main{
  
  public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
      int n = scn.nextInt();
      int sourceBase = scn.nextInt();
     int  destBase= scn.nextInt();
     
     int dnum = anyBaseToDecimal(n,sourceBase);
     int ans=decimalToAnyBase(dnum,destBase);
     
     System.out.print(ans);
   }   
   public static int decimalToAnyBase(int n, int b){
       int newN=n;
       int number=0,i=0;
       while(newN!=0){
           int rem=newN%b;
           number= number + rem * (int)Math.pow(10,i);
           newN=newN/b;
           i++;
       }
       return number;
   }
    public static int anyBaseToDecimal(int n, int b){
      int ans=0,i=0;
      while(n!=0){
          int digit=n%10;
          ans+=digit*(int)Math.pow(b,i);
          n=n/10;
          i++;
      }
      return ans;
   }
  }