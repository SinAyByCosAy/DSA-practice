/*
Example 1:
Input:153
Output: Yes, it is an Armstrong Number
Explanation: 1^3 + 5^3 + 3^3 = 153

Input:170
Output: No, it is not an Armstrong Number
Explanation: 1^3 + 7^3 + 0^3 != 170
 */
package StriverPractice.BasicMaths;

import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int copy = n;
        int armstrongNumber = 0;
        while(n != 0){
            int a = n % 10;
            armstrongNumber += a*a*a;
            n /= 10;
        }
        if(armstrongNumber == copy){
            System.out.println("Yes, It is an Armstrong Number");
        }else{
            System.out.println("No, It is not an Armstrong Number");
        }
    }
}
