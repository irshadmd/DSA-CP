import java.util.*;

// 1. You are given a number n.
// 2. You've to write code to print the pattern given in output format below

//     Constraints
//     1 <= n <= 10
//     Also, n is odd.

//     Sample Input
//     7

//     Sample Output
//     *	*	*	*	*	*	*	
//         *				*	
//             *		*	
//                 *	
//             *	*	*	
//         *	*	*	*	*	
//     *	*	*	*	*	*	*	

public class Main{

public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);

     // write ur code here
    int n=scn.nextInt();
    int stars=n;
    int spaces=0;
    
    for(int i=1;i<=n;i++){
        for(int j=1;j<=spaces;j++){
            System.out.print("\t");
        }
        for(int j=1;j<=stars;j++){
            if(i>=2 && i<=n/2){
                if(j==1||j==stars){
                    System.out.print("*\t");
                }else{
                    System.out.print("\t");
                }
            }else{
                System.out.print("*\t");
            }
        }
        for(int j=1;j<=spaces;j++){
            System.out.print("\t");
        }
        if(i<=n/2){
            spaces++;
            stars-=2;
        }else{
            spaces--;
            stars+=2;
        }
        System.out.println();
    }
 }
}