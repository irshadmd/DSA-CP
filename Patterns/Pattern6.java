import java.util.*;

// 1. You are given a number n.
// 2. You've to create a pattern of * and separated by tab as shown in output format.

//     Constraints
//     1 <= n <= 100
//     Also, n is odd.

//     Sample Input
//     5

//     Sample Output
//     *	*	*		*	*	*	
//     *	*				*	*	
//     *						*	
//     *	*				*	*	
//     *	*	*		*	*	*	


public class Main {

  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);

    // write ur code here
    int n = scn.nextInt();

    int spaces = n / 2;
    int stars = 1;

    for (int i = 1; i <= n; i++) {
      System.out.print("*\t");
      for (int j = 1; j <= spaces; j++) {
        System.out.print("*\t");
      }
      for (int j = 1; j <= stars; j++) {
        System.out.print("\t");
      }
      for (int j = 1; j <=spaces; j++) {
        System.out.print("*\t");
      }
      System.out.print("*\t");
      System.out.println();

      if (i <= n / 2) {
        stars += 2;
        spaces--;
      } else {
        stars -= 2;
        spaces++;
      }
    }
  }
}