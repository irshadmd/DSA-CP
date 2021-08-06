import java.io.*;
import java.util.*;

// Question
// 1. You are given a number n, representing the count of elements.
// 2. You are given n numbers.
// 3. You are given a number "tar".
// 4. Complete the body of printTargetSumSubsets function - without changing signature - to calculate and print all subsets of given elements, the contents of which sum to "tar". Use sample input and output to get more idea.

// Constraints
// 1 <= n <= 30
// 0 <= n1, n2, .. n elements <= 20
// 0 <= tar <= 50
// Sample Input
// 5
// 10
// 20
// 30
// 40
// 50
// 60
// Sample Output
// 10, 20, 30, .
// 10, 50, .
// 20, 40, .

public class Main {

  public static void main(String[] args) throws Exception {
    Scanner s = new Scanner(System.in);
    int n = s.nextInt();
    int[] arr = new int[n];
    for (int i = 0; i < n; i++) {
      arr[i] = s.nextInt();
    }
    int tar = s.nextInt();
    printTargetSumSubsets(arr,0,"",0,tar);
  }

  public static void printTargetSumSubsets(int[] arr, int idx, String asf, int ssf, int tar) {
    if(ssf>tar){
        return;
    }
    if(idx==arr.length){
        if(ssf==tar){
            System.out.println(asf+".");
        }
        return;
    }
    
    printTargetSumSubsets(arr,idx+1,asf+arr[idx]+", ",ssf+arr[idx],tar);
    printTargetSumSubsets(arr,idx+1,asf,ssf,tar);
  }

}