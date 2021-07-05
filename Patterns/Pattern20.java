import java.util.*;

// 1. You are given a number n.
// 2. You've to write code to print the pattern given in output format below

//     Constraints
//     1 <= n <= 10
//     Also, n is odd.

//     Sample Input
//     5

//     Sample Output
//     *				*	
//     *				*	
//     *		*		*	
//     *	*		*	*	
//     *				*	

public class Main {

  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);

    // write ur code here
    int n = scn.nextInt();

    int spaces = n - 2;

    int stars = 1;
    int inspaces = (n - 3) / 2;

    if (n == 1) {
        System.out.print("*\t");
    } else {
      for (int i = 1; i <= n; i++) {
        if (i >= 1 && i <= n / 2) {
          System.out.print("*\t");
          for (int j = 1; j <= spaces; j++) {
            System.out.print("\t");
          }
          System.out.print("*\t");
        } else if (i > n / 2 && i <= n - 1) {

          System.out.print("*\t");

          for (int j = 1; j <= inspaces; j++) {
            System.out.print("\t");
          }
          for (int j = 1; j <= stars; j++) {
            if (j == 1 || j == stars) {
              System.out.print("*\t");
            } else {
              System.out.print("\t");
            }
          }
          for (int j = 1; j <= inspaces; j++) {
            System.out.print("\t");
          }

          System.out.print("*\t");

          stars = stars + 2;
          inspaces = inspaces - 1;

        } else if (i == n) {
          System.out.print("*\t");
          for (int j = 1; j <= spaces; j++) {
            System.out.print("\t");
          }
          System.out.print("*\t");
        }


        System.out.println();

      }
    }

  }
}