import java.io.*;
import java.util.*;

// Question
// 1. You are given a square matrix of size 'n'. You are given n*n elements of the square matrix. 
// 2. You are required to find the saddle price of the given matrix and print the saddle price. 
// 3. The saddle price is defined as the least price in the row but the maximum price in the column of the matrix.

// Constraints
// 1 <= n <= 10^2
// -10^9 <= e11, e12, .. n * m elements <= 10^9
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
// Sample Output
// 41

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
    
    
    for(int i=0;i<n;i++){
        int min=arr[i][0];
        int colno=0;
        
        for(int col=0;col<n;col++){
            if(arr[i][col]<min){
                min=arr[i][col];
                colno=col;
            }
        }
        boolean ans=true;
        for(int row=0;row<n;row++){
            if(arr[row][colno]>min){
                ans=false;
                break;
            }
        }
        if(ans==true){
            System.out.println(min);
            return;
        }
        
    }

    System.out.println("Invalid input");

  }

}