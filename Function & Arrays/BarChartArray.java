import java.io.*;
import java.util.*;

// Question
// 1. You are given a number n, representing the size of array a.
// 2. You are given n numbers, representing elements of array a.
// 3. You are required to print a bar chart representing value of arr a.

// Constraints
// 1 <= n <= 30
// 0 <= n1, n2, .. n elements <= 10

// Sample Input
// 5
// 3
// 1
// 0
// 7
// 5

// Sample Output
// 			*		
// 			*		
// 			*	*	
// 			*	*	
// *			*	*	
// *			*	*	
// *	*		*	*	

public class Main{

public static void main(String[] args) throws Exception {
    // write your code here
 
    Scanner s=new Scanner(System.in);
    int n=s.nextInt();    
    
    int[] a=new int[n];
    for(int i=0;i<n;i++){
        a[i]=s.nextInt();
    }
    
    int largest=a[0];
    for(int i=1;i<n;i++){
        if(a[i]>largest){
            largest=a[i];
        }
    }
    
    for(int i=largest;i>=1;i--){
        for(int j=0;j<n;j++){
            if(i>a[j]){
                System.out.print("\t");
            }else{
                System.out.print("*\t");
            }
        }
        System.out.println();
    }

}

}