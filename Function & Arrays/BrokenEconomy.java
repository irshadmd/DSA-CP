import java.io.*;
import java.util.*;

// Question
// In a country of novice government, the economic system is changed where only coins are used that 
// too of various denominations. Whenever a foreigner visits this country, they visit a money exchanger 
// to get the currency of the same country. As the foreigner is unaware of the denomination of the country, 
// the money exchange prefers to tell them the denomination which is the nearest maximum and nearest minimum
// to the denomination mentioned by the foreigner. In case they get the correct guess of the denomination,
// they are told the same denomination. The denominations are always quoted in ascending order.
// Example 1: In a country, 8 given denominations are as follows
// [5, 10, 15, 22, 33, 40, 42, 55]

// The foreigner asks for denomination 25.
// The money exchange tells them that denominations of 33 and 22 are available.

// Example 2: 
// In a country, 5 given denominations are as follows
// [7, 14, 18, 25, 30]

// The foreigner asks for the denomination of 18.
// The money exchange tells them a denomination of 18 is available.  

// Constraints
// 1 <= n <= 1000
// -10^9 <= n1, n2, .. n elements <= 10^9
// -10^9 <= d <= 10^9

// Sample Input
// 10
// 1
// 5
// 10
// 15
// 22
// 33
// 40
// 42
// 55
// 66
// 34

// Sample Output
// 40
// 33

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
    
    int ceil=-1,floor=-1;
    
    int f=0;
    int l=a.length-1;
    
    while(f<=l){
        int mid=(f+l)/2;
        if(d==a[mid]){
           floor=d;
           ceil=d;
        }else if(d>a[mid]){
            floor=a[mid];
            f=mid+1;
        }else if(d<a[mid]){
            ceil=a[mid];
            l=mid-1;
        }
    }   
    
    System.out.println(ceil);
    System.out.println(floor);
 }
 

}