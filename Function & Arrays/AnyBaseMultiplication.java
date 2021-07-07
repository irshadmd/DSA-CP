import java.util.*;

// Question:
// 1. You are given a base b.
// 2. You are given two numbers n1 and n2 of base b.
// 3. You are required to multiply n1 and n2 and print the value.

// Input Format:
// A base b
// A number n1
// A number n2

// Output Format:
// A number of base b equal in value to n2 * n1.

// Constraints:
// 2 <= b <= 10
// 0 <= n1 <= 10000
// 0 <= n2 <= 10000

// Sample Input:
// 5
// 1220
// 31

// Sample Output:
// 43320

public class Main{

public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int b = scn.nextInt();
    int n1 = scn.nextInt();
    int n2 = scn.nextInt();

    int d = getProduct(b, n1, n2);
    System.out.println(d);
 }

     public static int getProduct(int b, int n1, int n2){
         // write your code here
         
         int pow=1;
         int sum=0;
         
         if(n2>n1){
             int s=n1;
             n1=n2;
             n2=s;
         }
         
         while(n2!=0){
             int d2=n2%10;
             
             n2=n2/10;
             
             sum=getSum(b,getSingleDigitProduct(b,n1,d2)*pow,sum);
             
             pow=pow*10;
         }
         return sum;
         
     }
     
     public static int getSingleDigitProduct(int b, int n1, int n2){
       int ans=0;
       int c=0;
       int i=0;
       
       while(n1!=0 || c!=0){
           
           int d1=n1%10;
           
           n1=n1/10;
           
           int sum = (d1*n2)+c;
           
           int r=sum%b;
           int q=sum/b;
           
           ans+=r * (int)Math.pow(10,i);
           c=q;
           i++;
       }
       
       return ans;
   }

    public static int getSum(int b, int n1, int n2){
       int ans=0;
       int c=0;
       int i=0;
       while(n1!=0 || n2!=0 || c!=0){
           int d1=n1%10;
           int d2=n2%10;
           
           n1=n1/10;
           n2=n2/10;
           
           int sum= d1+d2+c;
           
           int r=sum%b;
           int q=sum/b;
           
           ans+=r * (int)Math.pow(10,i);
           c=q;
           i++;
       }
       return ans;
   }
}