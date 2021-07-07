import java.io.*;
import java.util.*;

public class Main{

// Question
// 1. You are given a number n, representing the count of elements.
// 2. You are given n numbers.
// 3. You are required to find the span of input. Span is defined as difference of maximum value and minimum value.

// Sample Input
// 6
// 15
// 30
// 40
// 4
// 11
// 9

// Sample Output
// 36

public static void main(String[] args) throws Exception {
    // write your code here
    Scanner s=new Scanner(System.in);
    int n=s.nextInt();
    int[] ar=new int[n];
    
    for(int i=0;i<n;i++){
        ar[i]=s.nextInt();    
    }
    
    int greater=ar[0];
    for(int i=1;i<n;i++){
        if(ar[i]>greater){
            greater=ar[i];
        }
    }
    
    int smallest=ar[0];
    for(int i=1;i<n;i++){
        if(ar[i]<smallest){
            smallest=ar[i];
        }
    }
    
    System.out.print(greater-smallest);
    
 }

}