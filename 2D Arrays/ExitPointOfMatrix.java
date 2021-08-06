import java.io.*;
import java.util.*;

// Question
// 1. You are given a number n, representing the number of rows.
// 2. You are given a number m, representing the number of columns.
// 3. You are given n*m numbers (1's and 0's), representing elements of 2d array a.
// 4. Consider this array a maze and a player enters from top-left corner in east direction.
// 5. The player moves in the same direction as long as he meets '0'. On seeing a 1, he takes a 90 deg right turn.
// 6. You are required to print the indices in (row, col) format of the point from where you exit the matrix.

// Constraints
// 1 <= n <= 10^2
// 1 <= m <= 10^2
// e1, e2, .. n * m elements belongs to the set (0, 1)
// Sample Input
// 4
// 4
// 0
// 0
// 1
// 0
// 1
// 0
// 0
// 0
// 0
// 0
// 0
// 0
// 1
// 0
// 1
// 0
// Sample Output
// 1
// 3

public class Main {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int m=s.nextInt();
        int[][] arr=new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr[i][j]=s.nextInt();
            }
        }
        
        int dir=0;
        int i=0,j=0;
        
        while(i<arr.length && j<arr[0].length){
            dir=(dir+arr[i][j])%4;
            
            if(dir==0){
                j++;
            }else if(dir==1){
                i++;
            }else if(dir==2){
                j--;
            }else if(dir==3){
                i--;
            }
        }
        if(i>=arr.length){
            i--;
        }
        if(j>=arr[0].length){
            j--;
        }
        
        System.out.println(i);
        System.out.println(j);
    }

}