import java.io.*;
import java.util.*;

// Question
// 1. You are given a number n and a number m representing number of rows and columns in a maze.
// 2. You are standing in the top-left corner and have to reach the bottom-right corner. 
// 3. In a single move you are allowed to jump 1 or more steps horizontally (as h1, h2, .. ), or 1 or more steps vertically (as v1, v2, ..) or 1 or more steps diagonally (as d1, d2, ..). 
// 4. Complete the body of getMazePath function - without changing signature - to get the list of all paths that can be used to move from top-left to bottom-right.
// Use sample input and output to take idea about output.

// Constraints
// 0 <= n <= 10
// 0 <= m <= 10
// Sample Input
// 2
// 2
// Sample Output
// [h1v1, v1h1, d1]

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int m=s.nextInt();
        System.out.println(getMazePaths(0,0,n-1,m-1));
    }

    // sr - source row
    // sc - source column
    // dr - destination row
    // dc - destination column
    public static ArrayList<String> getMazePaths(int sr, int sc, int dr, int dc) {
     
        if(sr==dr && sc==dc){
            ArrayList<String> ar=new ArrayList<>();
            ar.add("");
            return ar;
        }
     
        ArrayList<String> mr=new ArrayList<>();
        
        for(int jump=1;jump<=dc-sc;jump++){
            ArrayList<String> rr=getMazePaths(sr,sc+jump,dr,dc);
            for(int i=0;i<rr.size();i++){
                mr.add("h"+jump+rr.get(i));
            }
        }
        
        for(int jump=1;jump<=dr-sr;jump++){
            ArrayList<String> rr=getMazePaths(sr+jump,sc,dr,dc);
            for(int i=0;i<rr.size();i++){
                mr.add("v"+jump+rr.get(i));
            }
        }
        
        for(int jump=1;jump<=dc-sc && jump<=dr-sr;jump++){
            ArrayList<String> rr=getMazePaths(sr+jump,sc+jump,dr,dc);
            for(int i=0;i<rr.size();i++){
                mr.add("d"+jump+rr.get(i));
            }
        }
        return mr;
    }

}