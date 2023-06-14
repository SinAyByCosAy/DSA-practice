/*
Example 1:
Input: N = 123
Output: Not Palindrome Number
Explanation: 123 read backwards is 321.Since these are two different numbers 123 is not a palindrome.

Example 2:
Input: N =  121
Output: Palindrome Number
Explanation: 121 read backwards as 121.Since these are two same numbers 121 is a palindrome.
 */
package StriverPractice.BasicMaths;

import java.util.Scanner;

public class CheckPalindrome {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int original = n;
        int rev = 0;
        while(n!=0){
            rev = rev * 10 + n % 10;
            n /= 10;
        }
        if(original == rev){
            System.out.println("Palidrome Number");
        }else{
            System.out.println("Not Palindrome Number");
        }
    }
}
