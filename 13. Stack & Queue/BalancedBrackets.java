import java.io.*;
import java.util.*;

// Question
// 1. You are given a string exp representing an expression.
// 2. You are required to check if the expression is balanced i.e. closing brackets and opening brackets match up well.

// e.g.
// [(a + b) + {(c + d) * (e / f)}] -> true
// [(a + b) + {(c + d) * (e / f)]} -> false
// [(a + b) + {(c + d) * (e / f)} -> false
// ([(a + b) + {(c + d) * (e / f)}] -> false

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner s=new Scanner(System.in);
        String str=s.nextLine();
        System.out.println(balancedBrackets(str));
        
    }
    public static boolean balancedBrackets(String str){
        Stack<Character> stack=new Stack<>();
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(ch=='(' || ch=='{' ||ch=='['){
                stack.push(ch);
            }else if(ch==')' || ch=='}' ||ch==']'){
                if(stack.size()==0){
                    return false;
                }else if(ch==')' && stack.peek()!='(' || ch=='}' && stack.peek()!='{' ||  ch==']' && stack.peek()!='['){
                    return false;
                }else{
                    stack.pop();
                }
            }
        }
        
        if(stack.size()==0){
            return true;
        }else {
            return false;
        }
    }

}