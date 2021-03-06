import java.io.*;
import java.util.*;

// Question
// 1. You are given a number n, representing the count of elements.
// 2. You are given n numbers.
// 3. You are given a number x. 
// 4. You are required to find the first index at which x occurs in array a.
// 5. If x exists in array, print the first index where it is found otherwise print -1.

// Constraints
// 1 <= n <= 10^4
// 0 <= n1, n2, .. n elements <= 10 ^ 3
// 0 <= x <= 10 ^ 3
// Sample Input
// 6
// 15
// 11
// 40
// 4
// 4
// 9
// 4
// Sample Output
// 3

public class Main {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=s.nextInt();
        }
        int x=s.nextInt();
        System.out.println(firstIndex(arr,0,x));
    }

    public static int firstIndex(int[] arr, int idx, int x){
        if(idx==arr.length){return -1;}
        
        if(arr[idx]==x){
            return idx;
        }else{
           return firstIndex(arr,idx+1,x);
        }
        
    }

}