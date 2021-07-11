import java.io.*;
import java.util.*;

// Question
// 1. You are given a number n, representing the number of rows.
// 2. You are given a number m, representing the number of columns.
// 3. You are given n*m numbers, representing elements of 2d array a.
// 4. You are required to display the contents of 2d array as suggested by output format below.

public class Main{

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
    
    for(int i=0;i<n;i++){
        for(int j=0;j<m;j++){
            System.out.print(a[i][j]+" ");
        }
        System.out.println();
    }
    
    
 }

}