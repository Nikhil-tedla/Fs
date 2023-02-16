/*
AlphaCipher is a string formed from another string by rearranging its letters

You are given a string S.
Your task is to check, can any one of the AlphaCipher is a palindrome or not.

Input Format:
-------------
A string S

Output Format:
--------------
Print a boolean value.


Sample Input-1:
---------------
carrace

Sample Output-1:
----------------
true


Sample Input-2:
---------------
code

Sample Output-2:
----------------
false
*/

import java.util.*;
public class bitpalindrome {


       public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        BitSet b=new BitSet();
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            b.flip(c);
        }
        if(b.cardinality()<=1){
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }
        
    }
}

