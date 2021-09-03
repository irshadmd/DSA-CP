import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=s.nextInt();
        }
        int amount=s.nextInt();
        System.out.println(coinChangeTab(arr,amount));
    }
    
    public static int coinChangeTab(int[] denoms,int amount){
        int[] dp=new int[amount+1];
        dp[0]=1;
        
        for(int i=0;i<denoms.length;i++){
            int coin=denoms[i];
            for(int j=1;j<dp.length;j++){
                if(j-coin>=0){
                    dp[j]+=dp[j-coin];
                }
            }
        }
        
        return dp[amount];
    }
}