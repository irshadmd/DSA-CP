import java.util.*;

// 1. You are given a number n.
// 2. You've to create a pattern of * and separated by tab as shown in output format.

//     Constraints
//     1 <= n <= 100

//     Sample Input
//     5

//     Sample Output
//     *	
//         *	
//             *	
//                 *	
//                     *	

public class Main {

  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);

    // write ur code here
    int n = scn.nextInt();

    int spaces = 0;
    int stars = 1;

    for (int i = 1; i <= n; i++) {
      for (int j = 1; j <= spaces; j++) {
        System.out.print("\t");
      }

      System.out.print("*\t");
      System.out.println();
      spaces++;
    }
  }
}