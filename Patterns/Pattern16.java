import java.util.*;

// 1. You are given a number n.
// 2. You've to write code to print the pattern given in output format below

// Constraints
// 1 <= n <= 10

// Sample Input
// 7

// Sample Output
// 1												1	
// 1	2										2	1	
// 1	2	3								3	2	1	
// 1	2	3	4						4	3	2	1	
// 1	2	3	4	5				5	4	3	2	1	
// 1	2	3	4	5	6		6	5	4	3	2	1	
// 1	2	3	4	5	6	7	6	5	4	3	2	1	

public class Main {

  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);

    // write ur code here
    int n = scn.nextInt();

    int spaces = (2 * n) - 3;
    int stars = 1;

    for (int i = 1; i <= n; i++) {
      int inval = stars;
      for (int j = 1; j <= stars; j++) {
        System.out.print(j + "\t");
      }
      for (int j = 1; j <= spaces; j++) {
        System.out.print("\t");
      }

      if (i == n) {
        stars--;
      }
      for (int j = stars; j >= 1; j--) {
        System.out.print(j + "\t");
      }


      spaces = spaces - 2;
      stars++;
      System.out.println();
    }

  }
}