/*
Example 1:
Input: N = 123
Output: 321
Explanation: The reverse of 123 is 321

Example 2:
Input: N = 234
Output: 432
Explanation: The reverse of 234 is 432
 */
package StriverPractice.BasicMaths;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int rev = 0;
        while(n!=0){
            rev = rev * 10 + n%10;
            n/=10;
        }
        System.out.println(rev);
    }
}
