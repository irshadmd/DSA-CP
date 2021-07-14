import java.io.*;
import java.util.*;

// Question
// 1. You are given a number n, representing the number of rows.
// 2. You are given a number m, representing the number of columns.
// 3. You are given n*m numbers, representing elements of 2d array a.
// 4. You are required to traverse and print the contents of the 2d array in form of a spiral.
// Note - Please check the sample output for details.

// Constraints
// 1 <= n <= 10^2
// 1 <= m <= 10^2
// -10^9 <= e1, e2, .. n * m elements <= 10^9

// Sample Input
// 3
// 5
// 11
// 12
// 13
// 14
// 15
// 21
// 22
// 23
// 24
// 25
// 31
// 32
// 33
// 34
// 35

// Sample Output
// 11
// 21
// 31
// 32
// 33
// 34
// 35
// 25
// 15
// 14
// 13
// 12
// 22
// 23
// 24

public class Main {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int m=s.nextInt();
        int[][] a=new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                a[i][j]=s.nextInt();
            }
        }

        int rmin=0;
        int cmin=0;
        int rmax=n-1;
        int cmax=m-1;
        int count=0;
        while(count<n*m){
            for(int row=rmin;row<=rmax && count<n*m;row++){
                System.out.println(a[row][cmin]);
                count++;
            }
            cmin++;
            
            for(int col=cmin;col<=cmax && count<n*m;col++){
                System.out.println(a[rmax][col]);
                count++;
            }
            rmax--;
            
            for(int row=rmax;row>=rmin && count<n*m;row--){
                System.out.println(a[row][cmax]);
                count++;
            }
            cmax--;
            
            for(int col=cmax;col>=cmin && count<n*m;col--){
                System.out.println(a[rmin][col]);
                count++;
            }
            rmin++;
        }
        
    }

}