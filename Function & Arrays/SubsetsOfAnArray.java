import java.io.*;
import java.util.*;


// Question
// 1. You are given a number n, representing the count of elements.
// 2. You are given n numbers.
// 3. You are required to print all subsets of arr. Each subset should be
// on separate line. For more clarity check out sample input and output.

// Constraints
// 1 <= n <= 10
// 0 <= n1, n2, .. n elements <= 10^3

// Sample Input
// 3
// 10
// 20
// 30

// Sample Output
// -	-	-	
// -	-	30	
// -	20	-	
// -	20	30	
// 10	-	-	
// 10	-	30	
// 10	20	-	
// 10	20	30	


public class Main{

public static void main(String[] args) throws Exception {
    // write your code here
    Scanner s=new Scanner(System.in);
    int n=s.nextInt();
    int[] a=new int[n];
    for(int i=0;i<n;i++){
        a[i]=s.nextInt();
    }
    
    int tns=(int)Math.pow(2,n);
    
    
    for(int i=0;i<tns;i++){
        int bno=decimalToBinary(i);
        int div=(int)Math.pow(10,n-1);
        
        for(int j=0;j<n;j++){
            int r=bno%div;
            int q=bno/div;
            if(q==1){
                System.out.print(a[j]+"\t");
            }else{
                System.out.print("-\t");
            }
            bno=r;
            div/=10;
        }
        System.out.println();
        
        
    }
 }
 
 public static int decimalToBinary(int n){
     int ans=0,p=1;
     while(n!=0){
         int r=n%2;
         ans+=r*p;
         p=p*10;
         n=n/2;
     }
     return ans;
 }

}