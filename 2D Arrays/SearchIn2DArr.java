import java.io.*;
import java.util.*;

// Question
// 1. You are given a number n, representing the number of rows and columns of a square matrix.
// 2. You are given n * n numbers, representing elements of 2d array a. 
// Note - Each row and column is sorted in increasing order.
// 3. You are given a number x.
// 4. You are required to find x in the matrix and print it's location int (row, col) format as discussed in output format below.
// 5. In case element is not found, print "Not Found".

// Constraints
// 1 <= n <= 10^2
// -10^9 <= e11, e12, .. n * m elements <= 10^9
// All rows and columns are sorted in increasing order
// Sample Input
// 4
// 11
// 12
// 13
// 14
// 21
// 22
// 23
// 24
// 31
// 32
// 33
// 34
// 41
// 42
// 43
// 44
// 43
// Sample Output
// 3
// 2

public class Main {

  public static void main(String[] args) throws Exception {
    // write your code here
    Scanner s = new Scanner(System.in);
    int n = s.nextInt();
    int[][] arr = new int[n][n];
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++) {
        arr[i][j] = s.nextInt();
      }
    }
    int d=s.nextInt();

    boolean flag=false;
    
    int i=n-1;
    int j=0;
    while(j<n){
        if(arr[i][j]>d){
            i--;
        }else if(arr[i][j]<d){
            j++;
        }else{
            flag=true;
            System.out.println(i);
            System.out.println(j);
            break;
        }
    }
    if(flag==false){
        System.out.println("Not Found");
    }

  }

}