import java.io.*;
import java.util.*;

// Question
// 1. You are given a number x.
// 2. You are given another number n.
// 3. You are required to calculate x raised to the power n. Don't change the signature of power function .

// Constraints
// 1 <= x <= 10
// 0 <= n <= 9
// Sample Input
// 2
// 5
// Sample Output
// 32

public class Main {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner s=new Scanner(System.in);
        int x=s.nextInt();
        int n=s.nextInt();
        
        System.out.println(power(x,n));     
    }

    public static int power(int x, int n){
        if(n==0) return 1;
        
        return x*power(x,n-1);
    }

}