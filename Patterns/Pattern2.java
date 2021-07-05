import java.util.*;

// 1. You are given a number n.
// 2. You've to create a pattern of * and separated by tab as shown in output format.


// Sample Input
// 5

// *	*	*	*	*	
// *	*	*	*	
// *	*	*	
// *	*	
// *

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        // write ur code here
        int n=scn.nextInt();
        
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i+1;j++){
                System.out.print("*\t");
            }
            System.out.println();
        }

    }
}