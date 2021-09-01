import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int m=s.nextInt();
        int[][] arr=new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr[i][j]=s.nextInt();
            }
        }
        
        // int max=0;
        // for(int i=0;i<n;i++){
        //     max=Math.max(max,goldMineR(arr,i,0));
        // }
        // System.out.println(max);
        
         int max=0;
        for(int i=0;i<n;i++){
            
            max=Math.max(max,goldMineMemo(arr,i,0,new int[n][m]));
        }
        System.out.println(max);
        
        // System.out.println(goldMine(arr));//tabulation
        
    }
    
    //Recursive Solution
    public static int goldMineR(int[][] arr, int sr,int sc){
        if(sr<0 || sr >=arr.length){
            return Integer.MIN_VALUE;
        }
        if(sc==arr[0].length-1){
            return arr[sr][sc];
        }
        
        int f1=goldMineR(arr,sr-1,sc+1);
        int f2=goldMineR(arr,sr,sc+1);
        int f3=goldMineR(arr,sr+1,sc+1);
        
        int ans=arr[sr][sc]+Math.max(f1,Math.max(f2,f3));
        return ans;
    }
    
    
    //Memoization Solution
    public static int goldMineMemo(int[][] arr, int sr,int sc,int[][] dp){
        if(sr<0 || sr >=arr.length){
            return Integer.MIN_VALUE;
        }
        if(sc==arr[0].length-1){
            return arr[sr][sc];
        }
        
        if(dp[sr][sc]!=0){
            return dp[sr][sc];
        }
        
        int f1=goldMineR(arr,sr-1,sc+1,dp);
        int f2=goldMineR(arr,sr,sc+1,dp);
        int f3=goldMineR(arr,sr+1,sc+1,dp);
        
        int ans=arr[sr][sc]+Math.max(f1,Math.max(f2,f3));
        dp[sr][sc]=ans;
        return ans;
    }
    
    
    //Tabulation Solution
    public static int goldMine(int[][] arr){
        int[][] dp=new int[arr.length][arr[0].length];
        
        for(int j=arr[0].length-1;j>=0;j--){
            for(int i=0;i<arr.length;i++){
                if(j==arr[0].length-1){
                    dp[i][j]=arr[i][j];
                }else if(i==0){
                    dp[i][j]=arr[i][j]+Math.max(dp[i][j+1],dp[i+1][j+1]);
                }else if(i==arr.length-1){
                    dp[i][j]=arr[i][j]+Math.max(dp[i][j+1],dp[i-1][j+1]);
                }else{
                    dp[i][j]=arr[i][j]+Math.max(dp[i][j+1],Math.max(dp[i-1][j+1],dp[i+1][j+1]));
                }
            }
        }
        int ans=0;
        for(int i=0;i<arr.length;i++){
            ans=Math.max(ans,dp[i][0]);
        }
        return ans;
    }

}