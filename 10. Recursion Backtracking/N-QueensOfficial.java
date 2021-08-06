import java.io.*;
import java.util.*;

// Question
// 1. You are given a number n, the size of a chess board.
// 2. You are required to place n number of queens in the n * n cells of board such that no queen can kill another.
// Note - Queens kill at distance in all 8 directions
// 3. Complete the body of printNQueens function - without changing signature - to calculate and print all safe configurations of n-queens. Use sample input and output to get more idea.

// Constraints
// 1 <= n <= 10
// Sample Input
// 4
// Sample Output
// 0-1, 1-3, 2-0, 3-2, .
// 0-2, 1-0, 2-3, 3-1, .

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        boolean[][] chess=new boolean[n][n];
        
        printNQueens(chess,"",0);
    }

    public static void printNQueens(boolean[][] chess, String qsf, int row) {
        
        if(row==chess.length){
            System.out.println(qsf+".");
            return;
        }
        
        for(int col=0;col<chess.length;col++){
            if(isItSafe(chess,row,col)==true){
                chess[row][col]=true;
                printNQueens(chess,qsf+row+"-"+col+", ",row+1);
                chess[row][col]=false;
            }
        }
    }
    
    public static boolean isItSafe(boolean[][] chess,int row,int col){
        
        //check in column
        for(int i=row-1;i>=0;i--){
            if(chess[i][col]==true){
                return false;
            }
        }
        
        //check in D1
        for(int i=row-1,j=col+1;i>=0 && j<chess.length;i--,j++){
            if(chess[i][j]==true){
                return false;
            }
        }
        
        //check in D2
        for(int i=row-1,j=col-1;i>=0 && j>=0;i--,j--){
            if(chess[i][j]==true){
                return false;
            }
        }
        
        return true;
    }
}

