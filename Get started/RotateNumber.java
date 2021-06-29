import java.util.*;
   
   public class Main{
   

//    1. You are given two numbers n and k. You are required to rotate n, k times to the right. If k is positive, rotate to the right i.e. remove rightmost digit and make it leftmost. Do the reverse for negative value of k. Also k can have an absolute value larger than number of digits in n.
// 2. Take as input n and k.
// 3. Print the rotated number.
// 4. Note - Assume that the number of rotations will not cause leading 0's in the result. e.g. such an input will not be given
//    n = 12340056
//    k = 3
//    r = 05612340

   
   public static void main(String[] args) {
     // write your code here  
     Scanner s=new Scanner(System.in);
     int n=s.nextInt();
     int k=s.nextInt();
     
     
     int num=n;
     int count=0;
     while(num!=0){
         num/=10;
         count++;
     }
     
     k=k%count;
     if(k<0){
         k=k+count;
     }
     int div=(int)Math.pow(10,k);
     int mul=(int)Math.pow(10,count-k);
     
     int q=n/div;
     int r=n%div;
     
     int ans=(r*mul)+q;
     System.out.println(ans);
     
    }
   }