import java.io.*;
import java.util.*;

// Question
// 1. You are given a string. 
// 2. You have to compress the given string in the following two ways - 
//    First compression -> The string should be compressed such that consecutive duplicates of characters are replaced with a single character.
//    For "aaabbccdee", the compressed string will be "abcde".
//    Second compression -> The string should be compressed such that consecutive duplicates of characters are replaced with the character and followed by the number of consecutive duplicates.
//    For "aaabbccdee", the compressed string will be "a3b2c2de2".

// Constraints
// 1 <= length of string <= 1000
// Sample Input
// wwwwaaadexxxxxx
// Sample Output
// wadex
// w4a3dex6

public class Main {

	public static String compression1(String str){
		// write your code here
        String s=""+str.charAt(0);
        char c=str.charAt(0);
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)!=c){
                c=str.charAt(i);
                s=s+c;
            }
        }
        
		return s;
	}

	public static String compression2(String str){
		// write your code here
        String s=""+str.charAt(0);
        int count=0;
        char c=str.charAt(0);
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)!=c){
                c=str.charAt(i);
                if(count!=1){
                    s=s+count+c;
                }else{
                    s=s+c;
                }
                count=1;
            }else{
                count++;
            }
        }
        if(count!=1){
            s=s+count;
        }
		return s;
	}
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		System.out.println(compression1(str));
		System.out.println(compression2(str));
	}

}