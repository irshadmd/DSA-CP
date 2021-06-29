import java.util.*;
  
  public class Main{

//     1. You are required to check if a given set of numbers is a valid pythagorean triplet.
// 2. Take as input three numbers a, b and c.
// 3. Print true if they can form a pythagorean triplet and false otherwise.
  
  public static void main(String[] args) {
    // write your code here  
    Scanner s=new Scanner(System.in);
    int a=s.nextInt();
    int b=s.nextInt();
    int c=s.nextInt();
    
    if(a>b&&a>c){
        if((b*b)+(c*c)==(a*a)){
            System.out.println(true);        
        }else{
            System.out.println(false);
        }
    }else if(b>c){
        if((a*a)+(c*c)==(b*b)){
            System.out.println(true);        
        }else{
            System.out.println(false);
        }
    }else{
        if((a*a)+(b*b)==(c*c)){
            System.out.println(true);        
        }else{
            System.out.println(false);
        }
    }
  }
 }