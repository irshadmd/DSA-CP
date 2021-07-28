import java.io.*;
import java.util.*;

// Question
// 1. You are given a number n representing number of stairs in a staircase.
// 2. You are standing at the bottom of staircase. You are allowed to climb 1 step, 2 steps or 3 steps in one move.
// 3. Complete the body of getStairPaths function - without changing signature - to get the list of all paths that can be used to climb the staircase up.
// Use sample input and output to take idea about output.

// Constraints
// 0 <= n <= 10
// Sample Input
// 3
// Sample Output
// [111, 12, 21, 3]

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        System.out.println(getStairPaths(n));
    }

    public static ArrayList<String> getStairPaths(int n) {
        
        if(n==0){
            ArrayList<String> ar=new ArrayList<>();
            ar.add("");
            return ar;
        }
        if(n<0){
            ArrayList<String> ar=new ArrayList<>();
            return ar;
        }
        
        ArrayList<String> st1= getStairPaths(n-1);
        ArrayList<String> st2= getStairPaths(n-2);
        ArrayList<String> st3= getStairPaths(n-3);
        
        ArrayList<String> mr=new ArrayList<>();
        
        for(int i=0;i<st1.size();i++){
            mr.add("1"+st1.get(i));
        }
        
        for(int i=0;i<st2.size();i++){
            mr.add("2"+st2.get(i));
        }
        
        for(int i=0;i<st3.size();i++){
            mr.add("3"+st3.get(i));
        }
        
        return mr;
    }

}