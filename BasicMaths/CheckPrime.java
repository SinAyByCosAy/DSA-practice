/*
Example 1:
Input: N = 3
Output: Prime
Explanation: 3 is a prime number

Example 2:
Input: N = 26
Output: Non-Prime
Explanation: 26 is not prime
 */
package StriverPractice.BasicMaths;

import java.util.Scanner;

public class CheckPrime {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sqrt = (int)Math.sqrt(n);
        for(int i=2;i<=sqrt;i++){
            if(n%i == 0){
                System.out.println("Non-Prime");
                return;
            }
        }
        System.out.println("Prime");
    }
}
//TC -> O(sqrt(N))