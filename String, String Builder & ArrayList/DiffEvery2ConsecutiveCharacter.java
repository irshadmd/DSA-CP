import java.io.*;
import java.util.*;

// Question(String With Difference Of Every Two Consecutive Characters)
// 1. You are given a string that contains only lowercase and uppercase alphabets. 
// 2. You have to form a string that contains the difference of ASCII values of every two consecutive characters between those characters.
//    For "abecd", the answer should be "a1b3e-2c1d", as 
//    'b'-'a' = 1
//    'e'-'b' = 3
//    'c'-'e' = -2
//    'd'-'c' = 1

// Constraints
// 1 <= length of string <= 1000
// Sample Input
// pepCODinG
// Sample Output
// p-11e11p-45C12O-11D37i5n-39G


public class Main {

	public static String solution(String str){
		// write your code here
        String s="";
        
        char c;
        for(int i=0;i<str.length()-1;i++){
            char a=str.charAt(i);
            char b=str.charAt(i+1);
            
            int dif=(b-a);    
            c=str.charAt(i);
            s=s+c+dif;
        }
        s=s+str.charAt(str.length()-1);
        
		return s;
	}
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		System.out.println(solution(str));
	}

}