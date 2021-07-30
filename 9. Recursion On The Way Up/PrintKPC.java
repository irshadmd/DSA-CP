import java.io.*;
import java.util.*;

// Question
// 1. You are given a string str. The string str will contains numbers only, where each number stands for a key pressed on a mobile phone.
// 2. The following list is the key to characters map
//     0 -> .;
//    1 -> abc
//    2 -> def
//    3 -> ghi
//    4 -> jkl
//    5 -> mno
//    6 -> pqrs
//    7 -> tu
//    8 -> vwx
//    9 -> yz
// 3. Complete the body of printKPC function - without changing signature - to print the list of all words that could be produced by the keys in str.
// Use sample input and output to take idea about output.

// Constraints
// 0 <= str.length <= 10
// str contains numbers only
// Sample Input
// 78
// Sample Output
// tv
// tw
// tx
// uv
// uw
// ux

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner s=new Scanner(System.in);
        String str=s.nextLine();
        printKPC(str,"");
    }
    
    static String[] choices={".;","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};

    public static void printKPC(String str, String asf) {
        if(str.length()==0){
            System.out.println(asf);
            return;
        }
        
        char ch=str.charAt(0);
        String ros=str.substring(1);
        
        String choice=choices[ch-'0'];
        for(int i=0;i<choice.length();i++){
            char c=choice.charAt(i);
            printKPC(ros,asf+c);
        }
        
    }

}