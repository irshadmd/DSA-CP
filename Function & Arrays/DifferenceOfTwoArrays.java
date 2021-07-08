import java.io.*;
import java.util.*;

// Question
// 1. You are given a number n1, representing the size of array a1.
// 2. You are given n1 numbers, representing elements of array a1.
// 3. You are given a number n2, representing the size of array a2.
// 4. You are given n2 numbers, representing elements of array a2.
// 5. The two arrays represent digits of two numbers.
// 6. You are required to find the difference of two numbers represented by two arrays and print the arrays. a2 - a1
// Assumption - number represented by a2 is greater.

// Constraints
// 1 <= n1, n2 <= 100
// 0 <= a1[i], a2[i] < 10
// number reresented by a1 is smaller than number represented by a2

// Input Format
// A number n1
// n1 number of elements line separated
// A number n2
// n2 number of elements line separated

// Sample Input
// 3
// 2
// 6
// 7
// 4
// 1
// 0
// 0
// 0

// Sample Output
// 7
// 3
// 3

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
    
    int[] a3=new int[n2];
    
    int i=a1.length-1;
    int j=a2.length-1;
    int k=a3.length-1;
    
    int b=0;
    
    while(k>=0){
        
        int sub=a2[j]-b;
        if(i>=0){
            sub-=a1[i];
        }
        
        if(sub>=0){
            b=0;
        }else{
            b=1;
            sub+=10;
        }
        
        a3[k]=sub;
        
        i--;
        j--;
        k--;
    }
    
    int l=0;
    while(a3[l]==0){
        l++;
    }
    
    for(l=l;l<n2;l++){
        System.out.println(a3[l]);
        
    }
 }

}