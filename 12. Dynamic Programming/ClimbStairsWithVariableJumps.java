import java.io.*;
import java.util.*;

// Question
// 1. You are given a number n, representing the number of stairs in a staircase.
// 2. You are on the 0th step and are required to climb to the top.
// 3. You are given n numbers, where ith element's value represents - till how far from the step you 
//      could jump to in a single move.  
//      You can of course jump fewer number of steps in the move.
// 4. You are required to print the number of different paths via which you can climb to the top.

// Constraints
// 0 <= n <= 20
// 0 <= n1, n2, .. <= 20
// Sample Input
// 10
// 3
// 3
// 0
// 2
// 1
// 2
// 4
// 2
// 0
// 0
// Sample Output
// 5

public class Main {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=s.nextInt();
        }
        // System.out.println(csj(arr,0,new int[n+1]));
         System.out.println(csjTab(arr));
    }
    
    //memoization solution
    public static int csj(int[] arr,int idx,int[] dp){
        if(idx==arr.length){ return 1;}
        if(idx>arr.length){return 0;}
        
        if(dp[idx]!=0){
            return dp[idx];
        }
        
        int ans=0;
        for(int jump=1;jump<=arr[idx];jump++){
            ans+=csj(arr,idx+jump,dp);
        }
        
        dp[idx]=ans;
        return ans;
    }
    
    //tabulization solution
    public static int csjTab(int[] arr){
        int n=arr.length;
        int[] dp=new int[n+1];
        
        dp[n]=1;
        for(int i=n-1;i>=0;i--){
            for(int jump=1;jump<=arr[i];jump++){
                if(i+jump<=n){
                    dp[i]+=dp[i+jump];
                }
            }
        }
        
        return dp[0];
    }
    

}