import java.io.*;
import java.util.*;

// Question
// 1. You are given a number n, the size of a chess board.
// 2. You are given a row and a column, as a starting point for a knight piece.
// 3. You are required to generate the all moves of a knight starting in (row, col) such that knight visits 
//      all cells of the board exactly once.
// 4. Complete the body of printKnightsTour function - without changing signature - to calculate and 
//      print all configurations of the chess board representing the route
//      of knight through the chess board. Use sample input and output to get more idea.

// Note -> When moving from (r, c) to the possible 8 options give first precedence to (r - 2, c + 1) and 
//                move in clockwise manner to
//                explore other options.

// Constraints
// n = 5
// 0 <= row < n
// 0 <= col < n
// Sample Input
// 5
// 2
// 0

// Sample Output
// 25 2 13 8 23 
// 12 7 24 3 14 
// 1 18 15 22 9 
// 6 11 20 17 4 
// 19 16 5 10 21 

// 19 2 13 8 21 
// 12 7 20 3 14 
// 1 18 15 22 9 
// 6 11 24 17 4 
// 25 16 5 10 23 
// ...

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int row=s.nextInt();
        int col=s.nextInt();
        
        
        printKnightsTour(new int[n][n],row,col,1);
    }

    public static void printKnightsTour(int[][] chess, int r, int c, int stepno) {
        if(r<0 || r>=chess.length || c<0 || c>=chess.length ||chess[r][c]>0){
            return;
        }
        
        if(stepno==chess.length*chess.length){
            chess[r][c]=stepno;
            displayBoard(chess);
            chess[r][c]=0;
            return;
        }
        
        chess[r][c]=stepno;
        printKnightsTour(chess,r-2,c+1,stepno+1);
        printKnightsTour(chess,r-1,c+2,stepno+1);
        printKnightsTour(chess,r+1,c+2,stepno+1);
        printKnightsTour(chess,r+2,c+1,stepno+1);
        printKnightsTour(chess,r+2,c-1,stepno+1);
        printKnightsTour(chess,r+1,c-2,stepno+1);
        printKnightsTour(chess,r-1,c-2,stepno+1);
        printKnightsTour(chess,r-2,c-1,stepno+1);
        chess[r][c]=0;
        
    }

    public static void displayBoard(int[][] chess){
        for(int i = 0; i < chess.length; i++){
            for(int j = 0; j < chess[0].length; j++){
                System.out.print(chess[i][j] + " ");
            }
            System.out.println();
        }
    
        System.out.println();
    }
}