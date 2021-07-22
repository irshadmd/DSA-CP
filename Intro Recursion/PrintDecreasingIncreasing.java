import java.io.*;
import java.util.*;

// Question
// 1. You are given a positive number n. 
// 2. You are required to print the counting from n to 1 and back to n again.
// 3. You are required to not use any loops. Complete the body of pdi function to achieve it. Don't change the signature of the function.

// Constraints
// 1 <= n <= 1000
// Sample Input
// 3
// Sample Output
// 3
// 2
// 1
// 1
// 2
// 3

public class Main {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        pdi(n);
    }

    public static void pdi(int n){
        
        if(n==0){
            return;
        }
        
        System.out.println(n);
        pdi(n-1); 
        System.out.println(n);
           
    }

}