import java.io.*;
import java.util.*;

// Question
// 1. You are given a number n, representing the number of stairs in a staircase.
// 2. You are on the 0th step and are required to climb to the top.
// 3. In one move, you are allowed to climb 1, 2 or 3 stairs.
// 4. You are required to print the number of different paths via which you can climb to the top.

// Constraints
// 0 <= n <= 20
// Sample Input
// 4
// Sample Output
// 7

public class Main {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int[] dp=new int[n+1];
        System.out.println(csDp(n));
    }
    
    //memoization solution
    public static int cs(int n,int[] dp){
        if(n==0){ return 1;}
        if(n<0){return 0;}
        
        if(dp[n]!=0){
            return dp[n];
        }
        int p1=cs(n-1,dp);
        int p2=cs(n-2,dp);
        int p3=cs(n-3,dp);
        
        int sum=p1+p2+p3;
        dp[n]=sum;
        return sum;
    }
    
    //tabulization solution
    public static int csDp(int n){
        int[] dp=new int[n+1];
        
        dp[0]=1;
        for(int i=1;i<=n;i++){
            dp[i]=dp[i-1];
            if(i>=2){
                dp[i]+=dp[i-2];
            }
            if(i>=3){
                dp[i]+=dp[i-3];
            }
        }
        return dp[n];
    }

}