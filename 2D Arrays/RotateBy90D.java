import java.io.*;
import java.util.*;

// Question
// 1. You are given a number n, representing the number of rows and number of columns.
// 2. You are given n*n numbers, representing elements of 2d array a.
// 3. You are required to rotate the matrix by 90 degree clockwise and then display the contents using display function.
// *Note - you are required to do it in-place i.e. no extra space should be used to achieve it .*

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
// 41 31 21 11
// 42 32 22 12
// 43 33 23 13
// 44 34 24 14

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

    rotate90D(arr);

    display(arr);
  }

  public static void rotate90D(int[][] arr) {
    //transpose
    for (int i = 0; i < arr.length - 1; i++) {
      for (int j = i + 1; j < arr[0].length; j++) {
        int temp = arr[j][i];
        arr[j][i] = arr[i][j];
        arr[i][j] = temp;
      }
    }
    
    //swap columns
    int left = 0;
    int right = arr[0].length-1;

    while(left<right){
        for(int row=0;row<arr.length;row++){
            int temp = arr[row][right];
            arr[row][right] = arr[row][left];
            arr[row][left] = temp;
        }
        left++;
        right--;
    }
    

  }

  public static void display(int[][] arr) {
    for (int i = 0; i < arr.length; i++) {
      for (int j = 0; j < arr[0].length; j++) {
        System.out.print(arr[i][j] + " ");
      }
      System.out.println();
    }
  }

}