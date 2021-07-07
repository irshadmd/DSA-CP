import java.io.*;
import java.util.*;

// Question
// 1.You are given a number n, representing the size of array a.
// 2.You are given n distinct numbers, representing elements of array a.
// 3. You are given another number d.
// 4. You are required to check if d number exists in the array a and at what index (0 based). If found print the index, otherwise print -1.

// Sample Input
// 6
// 15
// 30
// 40
// 4
// 11
// 9
// 40

// Sample Output
// 2

public class Main{

public static void main(String[] args) throws Exception {
    // write your code here
    Scanner s=new Scanner(System.in);
    int n=s.nextInt();
    
    int[] ar=new int[n];
    for(int i=0;i<n;i++){
        ar[i]=s.nextInt();
    }
    
    int d=s.nextInt();
    
    int flag=0;
    for(int i=0;i<n;i++){
        if(ar[i]==d){
            flag=1;
            System.out.print(i);
            break;
        }
    }
    if(flag==0){
        System.out.print(-1);
    }
 }

}