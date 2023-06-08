/*
Input Format: N = 3
Result:
  *
 ***
*****
Input Format: N = 6
Result:
     *
    ***
   *****
  *******
 *********
***********
 */
package StriverPractice.Patterns;

import java.util.Scanner;

public class Pattern7 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=n-i;j>=1;j--){
                System.out.print("  ");
            }
            for(int j=1;j<=2*i-1;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
