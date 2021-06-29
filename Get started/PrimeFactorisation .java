import java.util.*;

public class Main{

// 1. You are required to display the prime factorization of a number.
//     2. Take as input a number n.
//     3. Print all its prime factors from smallest to largest.
  
public static void main(String[] args) {
  // write your code here  
  Scanner s=new Scanner(System.in);
  int n=s.nextInt();
  
  for(int div=2;div*div<=n;div++){
      while(n%div==0){
          n=n/div;
          System.out.print(div+" ");
      }
    }
    if(n!=1){
        System.out.println(n);
    }
 }
}