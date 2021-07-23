import java.io.*;
import java.util.*;

// Question
// 1. You are given a number n.
// 2. You are required to calculate the factorial of the number. Don't change the signature of factorial function.

// Sample Input
// 5

// Sample Output
// 120

public class Main {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        System.out.println(factorial(n));
    }

    public static int factorial(int n){
        if(n==0) return 1;
        
        return n*factorial(n-1);
    }

}