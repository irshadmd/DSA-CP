import java.util.*;

// 1. You are given a number n.
// 2. You've to write code to print the pattern given in output format below.

//     Constraints
//     1 <= n <= 10
//     Also, n is odd.
//     Sample Input
//     5
//     Sample Output
//              1	
//          2	3	2	
//     3	4	5	4	3	
//          2	3	2	
//              1	


public class Main {

  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);

    // write ur code here

    int n = scn.nextInt();

    int spaces=n/2;
    int stars=1;

    int oval=1;
    
    for (int i = 1; i <= n; i++) {
        int inval=oval;
      for (int j = 1; j <= spaces; j++) {
        System.out.print("\t");
      }
      for (int j = 1; j <=stars; j++) {
        System.out.print(inval+"\t");
        if(j<=stars/2){
            inval++;
        }else{
            inval--;
        }
      }
      System.out.println();
      
      if(i<=n/2){
        stars+=2;
        spaces--;
        oval++;
      }else{
          stars-=2;
          spaces++;
          oval--;
      }
    }
  }
}