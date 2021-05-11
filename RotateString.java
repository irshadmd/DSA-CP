import java.util.*;

// Problem Description
// Given a string A, rotate the string B times in clockwise direction and return the string.

// Problem Constraints
// 1 <= |A| <= 105
// 1 <= B <= 109

// Input Format
// First and only argument is a string A.

// Output Format
// Return a string denoting the rotated string.

// Example Input
// Input 1:

//  A = "irshad"
//  B = 2
// Input 2:

//  A = "irshad"
//  B = 7

// Example Output
// Output 1: "adirsh"
// Output 2: "irshad"

class RotateString{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter String:");
		String A=scan.next();

		System.out.println("Enter no of types you want to rotate string:");
		int k=scan.nextInt();

		String rotatedString=rotateString(A,k);
		System.out.println("After Rotation: "+rotatedString);
	}

	public static String rotateString(String A,int k){
		int n=A.length();
		k=k%n;

		String s1=A.substring(n-k,n);
		String s2=A.substring(0,n-k);

		return s1+s2;
	}
}