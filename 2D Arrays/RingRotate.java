import java.io.*;
import java.util.*;

// Question
// You are given a n*m matrix where n are the number of rows and m are the number of columns. You are also given n*m numbers representing the elements of the matrix.
// You will be given a ring number 's' representing the ring of the matrix. For details, refer to image.

// shell-rotate

// You will be given a number 'r' representing number of rotations in an anti-clockwise manner of the specified ring.
// You are required to rotate the 's'th ring by 'r' rotations and display the rotated matrix.

// Constraints
// 1 <= n <= 10^2
// 1 <= m <= 10^2
// -10^9 <= e11, e12, .. n * m elements <= 10^9
// 0 < s <= min(n, m) / 2
// -10^9 <= r <= 10^9
// Sample Input
// 5
// 7
// 11
// 12
// 13
// 14
// 15
// 16
// 17
// 21
// 22
// 23
// 24
// 25
// 26
// 27
// 31
// 32
// 33
// 34
// 35
// 36
// 37
// 41
// 42
// 43
// 44
// 45
// 46
// 47
// 51
// 52
// 53
// 54
// 55
// 56
// 57
// 2
// 3

// Sample Output
// 11 12 13 14 15 16 17
// 21 25 26 36 46 45 27
// 31 24 33 34 35 44 37
// 41 23 22 32 42 43 47
// 51 52 53 54 55 56 57

public class Main {

  public static void main(String[] args) throws Exception {
    // write your code here
    Scanner s = new Scanner(System.in);
    int n = s.nextInt();
    int m = s.nextInt();
    int[][] arr = new int[n][m];
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < m; j++) {
        arr[i][j] = s.nextInt();
      }
    }
    int sno = s.nextInt();
    int r = s.nextInt();

    ringRotate(arr, sno, r);
    display(arr);

  }

  public static void ringRotate(int[][] arr, int sno, int r) {
    int[] la = fill1DFrom2D(arr, sno);
    rotate1D(la, r);
    fill2DFrom1D(arr, la, sno);
  }

  public static int[] fill1DFrom2D(int[][] arr, int sno) {

    int rmin = sno - 1;
    int cmin = sno - 1;
    int rmax = arr.length - sno;
    int cmax = arr[0].length - sno;

    int count = 0;

    int sz = 2 * (rmax + cmax - rmin - cmin);
    int[] a = new int[sz];


    for (int row = rmin; row <= rmax; row++) {
      a[count] = arr[row][cmin];
      count++;
    }
    cmin++;

    for (int col = cmin; col <= cmax; col++) {
      a[count] = arr[rmax][col];
      count++;
    }
    rmax--;

    for (int row = rmax; row >= rmin; row--) {
      a[count] = arr[row][cmax];
      count++;
    }
    cmax--;

    for (int col = cmax; col >= cmin; col--) {
      a[count] = arr[rmin][col];
      count++;
    }
    rmin++;


    return a;
  }

  public static void rotate1D(int[] la, int r) {
    r = r % la.length;
    if (r < 0) {
      r += la.length;
    }

    reverse(la, 0, la.length - 1);
    reverse(la, 0, r - 1);
    reverse(la, r, la.length - 1);
  }

  public static void reverse(int[] la, int left, int right) {
    while (left < right) {
      int temp = la[left];
      la[left] = la[right];
      la[right] = temp;
      left++;
      right--;
    }
  }

  public static void fill2DFrom1D(int[][] arr, int[] la, int sno) {

    int rmin = sno - 1;
    int cmin = sno - 1;
    int rmax = arr.length - sno;
    int cmax = arr[0].length - sno;

    int count = 0;

    for (int row = rmin; row <= rmax; row++) {
      arr[row][cmin] = la[count];
      count++;
    }
    cmin++;

    for (int col = cmin; col <= cmax; col++) {
      arr[rmax][col] = la[count];
      count++;
    }
    rmax--;

    for (int row = rmax; row >= rmin; row--) {
      arr[row][cmax] = la[count];
      count++;
    }
    cmax--;

    for (int col = cmax; col >= cmin; col--) {
      arr[rmin][col] = la[count];
      count++;
    }
    rmin++;
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