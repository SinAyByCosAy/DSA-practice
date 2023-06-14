/*
Example 1:
Input: N = 12345
Output: 5
Explanation: N has 5 digits

Example 2:
Input: N = 8394
Output: 4
Explanation: N has 4 digits
 */
package StriverPractice.BasicMaths;

import java.util.Scanner;

public class CountDigits {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n==0){
            System.out.print(1);
            return;
        }
        int count = 0;
        while(n!=0){
            count++;
            n/= 10;
        }
        System.out.println(count);
    }
}
