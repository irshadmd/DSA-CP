import java.io.*;
import java.util.*;

public class Main{

public static void main(String[] args) throws Exception {
    // write your code here
    Scanner s=new Scanner(System.in);
    int n=s.nextInt();
    int[] dp=new int[n+1];
    System.out.println(fibonacci(n,dp));
 }
 
 //memoization solution
 public static int fibonacci(int n,int[] dp){
     if(n==0|| n==1){
         return n;
     }
    
    if(dp[n]!=0){
        return dp[n];
    }
    
    int fibOfN= fibonacci(n-1,dp)+fibonacci(n-2,dp);
    dp[n]=fibOfN;
    return fibOfN;
 }

}