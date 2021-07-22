import java.io.*;
import java.util.*;

// Question
// 1. You are given a string. 
// 2. You have to print all permutations of the given string iteratively.

// Constraints
// 1 <= length of string <= 15
// Sample Input
// abc
// Sample Output
// abc
// bac
// cab
// acb
// bca
// cba

public class Main {

	public static void solution(String str){
		// write your code here
		int n=str.length();
		int tnp=fact(n);
		
		for(int i=0;i<tnp;i++){
		    StringBuilder sb=new StringBuilder(str);
		    for(int div=n,dvd=i;div>0;div--){
		        int r=dvd%div;
		        System.out.print(sb.charAt(r));
		        sb.deleteCharAt(r);
		        dvd=dvd/div;
		    }
		    System.out.println();
		}
	}
	
	public static int fact(int a){
	    int f=1;
	    for(int i=2;i<=a;i++){
	        f=f*i;
	    }
	    return f;
	}
	
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		solution(str);
	}

}