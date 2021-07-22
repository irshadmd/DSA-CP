import java.io.*;
import java.util.*;

// Question
// 1. You are given a positive number n. 
// 2. You are required to print the counting from 1 to n.
// 3. You are required to not use any loops. Complete the body of print Increasing function to achieve it. Don't change the signature of the function.

// Constraints
// 1 <= n <= 1000
// Sample Input
// 5
// Sample Output
// 1
// 2
// 3
// 4
// 5

public class Main {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        printIncreasing(n);
    }

    public static void printIncreasing(int n){
        if(n==0){
            return;
        }
        printIncreasing(n-1);
        System.out.println(n);
    }

}