import java.io.*;
import java.util.*;

// Question
// 1. You are given an ArrayList of positive integers.
// 2. You have to remove prime numbers from the given ArrayList and return the updated ArrayList.

// Note -> The order of elements should remain same.

// Constraints
// 1 <= N <= 10000
// Sample Input
// 4
// 3 12 13 15
// Sample Output
// [12, 15]

public class Main {

	public static void solution(ArrayList<Integer> al){
		// write your code here
		for(int i=0;i<al.size();){
		    if(isPrime(al.get(i))){
		        al.remove(i);
		    }else{
		        i++;
		    }
		}
	}
	
	public static boolean isPrime(int a){
	    for(int i=2;i*i<=a;i++){
	        if(a%i==0){
	           return false;
	        }
	    }
	    return true;
	}
	
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		ArrayList<Integer> al = new ArrayList<>();
		for(int i = 0 ; i < n; i++){
			al.add(scn.nextInt());
		}
		solution(al);
		System.out.println(al);
	}

}