import java.io.*;
import java.util.*;

// Question
// 1. You are given a number n, representing the size of array a.
// 2. You are given n numbers, representing elements of array a.
// Asssumption - Array is sorted. Array may have duplicate values.

// Constraints
// 1 <= n <= 1000
// 1 <= n1, n2, .. n elements <= 100
// 1 <= d <= 100

// Sample Input
// 15
// 1
// 5
// 10
// 15
// 22
// 33
// 33
// 33
// 33
// 33
// 40
// 42
// 55
// 66
// 77
// 33

// Sample Output
// 5
// 9

public class Main{

public static void main(String[] args) throws Exception {
    // write your code here
 
    Scanner s=new Scanner(System.in);
    int n=s.nextInt();
    int[] a=new int[n];
    for(int i=0;i<n;i++){
        a[i]=s.nextInt();
    }
    int d=s.nextInt();
    
    int firstIndex=-1;
    int lastIndex=-1;
    
    int f=0;
    int l=n-1;
    
    while(f<=l){
        int mid=(f+l)/2;
        if(a[mid]==d){
            lastIndex=mid;
            firstIndex=mid;
            f=mid+1;
        }else if(d>a[mid]){
            f=mid+1;
        }else if(d<a[mid]){
            l=mid-1;
        }
    }
    
    f=0;
    l=n-1;
    while(f<=l){
        int mid=(f+l)/2;
        if(a[mid]==d){
            firstIndex=mid;
            l=mid-1;
        }else if(d>a[mid]){
            f=mid+1;
        }else if(d<a[mid]){
            l=mid-1;
        }
    }
    System.out.println(firstIndex);
    System.out.println(lastIndex);
}

}