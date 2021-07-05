import java.util.*;

// 1. You are given a number n.
// 2. You've to create a pattern of * and separated by tab as shown in output format.

//     Constraints
//     1 <= n <= 10

//     Sample Input
//     5

//     Sample Output
//     1	
//     1	1	
//     1	2	1	
//     1	3	3	1	
//     1	4	6	4	1	

public class Main{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);

        //write your code here
        int n=scn.nextInt();
        
        for(int i=0;i<=n-1;i++){
            int val=1;
            for(int j=0;j<=i;j++){
                System.out.print(val+"\t");
                val=(val*(i-j))/(j+1);
            }
            System.out.println();
        }

    }
}