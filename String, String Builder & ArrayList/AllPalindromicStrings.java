import java.io.*;
import java.util.*;

// Question
// 1. You are given a string. 
// 2. You have to print all palindromic substrings of the given string.

// Constraints
// 1 <= length of string <= 500
// Sample Input
// abcc
// Sample Output
// a
// b
// c
// cc
// c

public class Main {

	public static void solution(String str){
		//write your code here
		for(int i=0;i<str.length();i++){
		    for(int j=i+1;j<str.length()+1;j++){
		        String st=str.substring(i,j);
		        if(isPalindrome(st)==true){
		            System.out.println(st);
		        }
		    }
		}
	}
	
	public static boolean isPalindrome(String st){
	    for(int i=0;i<st.length()/2;i++){
	        if(st.charAt(i)!=st.charAt(st.length()-1-i)){
	            return false;
	        }
	    }
	    return true;
	}

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		solution(str);
	}

}