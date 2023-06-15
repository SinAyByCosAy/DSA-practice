/*
Example 1:
Input: num1 = 4, num2 = 8
Output: 4
Explanation: Since 4 is the greatest number which divides both num1 and num2.

Example 2:
Input: num1 = 3, num2 = 6
Output: 3
Explanation: Since 3 is the greatest number which divides both num1 and num2.
 */
package StriverPractice.BasicMaths;

import java.util.Scanner;

public class GCD {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int gcd = 1;
        //brute
//        for(int i = 2; i <= Math.min(n, m); i++){
//            if(n % i == 0 && m % i == 0){
//                gcd = i;
//            }
//        }
        gcd = calculateGCD(n, m);
        System.out.println(gcd);
    }
    //optimized code - euclidean formula
    public static int calculateGCD(int a, int b){
        if(b == 0){
            return a;
        }
        return calculateGCD(b, a % b);
    }
}
