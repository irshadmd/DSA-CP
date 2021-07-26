import java.io.*;
import java.util.*;

// Question
// 1. You are given a number n, representing the size of array a.
// 2. You are given n numbers, representing elements of array a.
// 3. You are required to print the elements of array from beginning to end each in a separate line.
// 4. For the above purpose complete the body of displayArr function. Don't change the signature.

// Constraints
// 1 <= n <= 30
// 0 <= n1, n2, .. n elements <= 10
// Sample Input
// 5
// 3
// 1
// 0
// 7
// 5
// Sample Output
// 3
// 1
// 0
// 7
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
        displayArr(arr,0);
    }

    public static void displayArr(int[] arr, int idx){
        if(idx==arr.length){return;}
        
        System.out.println(arr[idx]);
        displayArr(arr,idx+1);
    }

}