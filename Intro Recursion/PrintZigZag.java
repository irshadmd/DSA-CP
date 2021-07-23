import java.io.*;
import java.util.*;

// Question
// 1. Here are a few sets of inputs and outputs for your reference
// Input1 -> 1
// Output1 -> 1 1 1

// Input2 -> 2
// Output2 -> 2 1 1 1 2 1 1 1 2

// Input2 -> 3
// Output3 -> 3 2 1 1 1 2 1 1 1 2 3 2 1 1 1 2 1 1 1 2 3

// 2. Figure out the pattern and complete the recursive function pzz to achieve the above for any positive number n.

// Constraints
// 1 <= n <= 10
// Sample Input
// 3
// Sample Output
// 3 2 1 1 1 2 1 1 1 2 3 2 1 1 1 2 1 1 1 2 3

public class Main {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        pzz(n);
    }

    public static void pzz(int n){
        if(n==0) return;
        
        System.out.print(n+" ");
        pzz(n-1);
        System.out.print(n+" ");
        pzz(n-1);
        System.out.print(n+" ");
    }

}