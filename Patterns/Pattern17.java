import java.util.*;

// 1. You are given a number n.
// 2. You've to write code to print the pattern given in output format below

//     Constraints
//     1 <= n <= 10
//     Also, n is odd.

//     Sample Input
//     5

//     Sample Output
//              *	
//              *	*	
//     *	*	*	*	*	
//              *	*	
//              *	

public class Main {

  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);

    // write ur code here

    int n = scn.nextInt();

    int spaces = n / 2;
    int stars = 1;

    for (int i = 1; i <= n; i++) {
      if(i==(n/2)+1){
          
      }else{
        for (int j = 1; j <= spaces; j++) {
            System.out.print("\t");
        }    
      }
      
      for (int j = 1; j <= stars; j++) {
        System.out.print("*\t");
      }
      if(i==(n/2)+1){
       for (int j = 1; j <= n/2; j++) {
        System.out.print("*\t");
      }   
      }
      System.out.println();

      if (i <= n / 2) {
        stars += 1;
        spaces=n/2;
      }
      else {
        stars -= 1;
        spaces=n/2;
      }
    }
  }
}