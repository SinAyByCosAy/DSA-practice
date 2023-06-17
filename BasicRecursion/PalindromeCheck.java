/*
Example 1:
Input: Str =  “ABCDCBA”
Output: Palindrome
Explanation: String when reversed is the same as string.

Example 2:
Input: Str = “TAKE U FORWARD”
Output: Not Palindrome
Explanation: String when reversed is not the same as string.
 */
package StriverPractice.BasicRecursion;

import java.util.Scanner;

public class PalindromeCheck {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        PalindromeCheck obj = new PalindromeCheck();
        if(obj.check(s,0,s.length()-1)){
            System.out.println("Palindrome");
        }else{
            System.out.println("Not Palindrome");
        }
    }
    boolean check(String s, int i, int j){
        if(i>j){
            return true;
        }
        if(s.charAt(i) != s.charAt(j)){
            return false;
        }
        return check(s, i+1, j-1);
    }
}
