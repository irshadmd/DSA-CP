import java.io.*;
import java.util.*;

// Question
// 1. You are given a number n1, representing the size of array a1.
// 2. You are given n1 numbers, representing elements of array a1.
// 3. You are given a number n2, representing the size of array a2.
// 4. You are given n2 numbers, representing elements of array a2.
// 5. The two arrays represent digits of two numbers.
// 6. You are required to add the numbers represented by two arrays and print the
// arrays.

// Constraints
// 1 <= n1, n2 <= 100
// 0 <= a1[i], a2[i] < 10

// Sample Input
// 5
// 3
// 1
// 0
// 7
// 5
// 6
// 1
// 1
// 1
// 1
// 1
// 1

// Sample Output
// 1
// 4
// 2
// 1
// 8
// 6

public class Main{

public static void main(String[] args) throws Exception {
    // write your code here
    Scanner s=new Scanner(System.in);
    
    int n1=s.nextInt();
    int[] a1=new int[n1];
    for(int i=0;i<n1;i++){
        a1[i]=s.nextInt();
    }
    
    int n2=s.nextInt();
    int[] a2=new int[n2];
    for(int i=0;i<n2;i++){
        a2[i]=s.nextInt();
    }
    
    int n3=Math.max(n1,n2)+1;
    int[] a3=new int[n3];
    
    int c=0;
    int i=a1.length-1;
    int j=a2.length-1;
    int k=a3.length-1;
    
    while(k>=0){
        
        int sum=c;
        
        if(i>=0){
            sum+=a1[i];    
        }
        if(j>=0){
            sum+=a2[j];
        }
        
        int r=sum%10;
        int q=sum/10;
        
        a3[k]=r;
        c=q;
        
        i--;
        j--;
        k--;
    }
    
    for(int l=0;l<n3;l++){
        if(l==0 && a3[0]==0){
            
        }else{
            System.out.println(a3[l]);
        }
    }
    
 }

}