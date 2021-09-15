import java.io.*;
import java.util.*;

// Question
// 1. You are given a string exp representing an expression.
// 2. Assume that the expression is balanced  i.e. the opening and closing brackets match with each other.
// 3. But, some of the pair of brackets maybe extra/needless. 
// 4. You are required to print true if you detect extra brackets and false otherwise.

// e.g.'
// ((a + b) + (c + d)) -> false
// (a + b) + ((c + d)) -> true

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner s=new Scanner(System.in);
        String str=s.nextLine();
        
        Stack<Character> stack=new Stack<>();
        for(int i=0;i<str.length();i++){
            char c=str.charAt(i);
            
            if(c==')'){
                if(stack.peek()=='('){
                    System.out.println(true);
                    return;
                }else{
                    while(stack.peek()!='('){
                        stack.pop();
                    }
                    stack.pop();
                }    
            }else{
                stack.push(c);
            }
            
        }
        
        System.out.println(false);
        
    }

}