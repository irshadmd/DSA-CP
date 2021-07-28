import java.io.*;
import java.util.*;

// Question
// 1. You are given a string str.
// 2. Complete the body of getSS function - without changing signature - to calculate all subsequences of str.
// Use sample input and output to take idea about subsequences.

// Constraints
// 0 <= str.length <= 20
// Sample Input
// abc
// Sample Output
// [, c, b, bc, a, ac, ab, abc]

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner s=new Scanner(System.in);
        String str=s.nextLine();
        System.out.println(gss(str));
    }

    public static ArrayList<String> gss(String str) {
        
        if(str.length()==0){
            ArrayList<String> ar=new ArrayList<>();
            ar.add("");
            return ar;
        }
        
        char ch=str.charAt(0);
        String ros=str.substring(1);
        
        ArrayList<String> rr=gss(ros);
        
        ArrayList<String> mr=new ArrayList<>();
        for(int i=0;i<rr.size();i++){
            mr.add(rr.get(i));
        }
        
        for(int i=0;i<rr.size();i++){
            mr.add(ch+rr.get(i));
        }
        
        return mr;
    }

}