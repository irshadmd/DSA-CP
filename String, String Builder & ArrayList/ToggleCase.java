import java.io.*;
import java.util.*;

// Question
// 1. You are given a string that contains only lowercase and uppercase alphabets. 
// 2. You have to toggle the case of every character of the given string.

// Constraints
// 1 <= length of string <= 1000
// Sample Input
// pepCODinG
// Sample Output
// PEPcodINg

public class Main {

	public static String toggleCase(String str){
		//write your code here
        String s="";
        for(int i=0;i<str.length();i++){
            char c=str.charAt(i);
            if(c >= 97 && c <= 122){
                c=(char)(c-32);
            }else{
                c=(char)(c+32);
            }
            s=s+c;
        }
		return s;
	}
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		System.out.println(toggleCase(str));
	}

}