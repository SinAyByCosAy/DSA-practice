/*
Input Format: N = 3
Result:
  A
 ABA
ABCBA


Input Format: N = 6
Result:
     A
    ABA
   ABCBA
  ABCDCBA
 ABCDEDCBA
ABCDEFEDCBA
 */
package StriverPractice.Patterns;

import java.util.Scanner;

public class Pattern17 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=i;j<n;j++){
                System.out.print("  ");
            }
            for(char ch='A';ch<'A'+i;ch++){
                System.out.print(ch+" ");
            }
            for(char ch=(char)('A'+(i-2));ch>='A';ch--){
                System.out.print(ch+" ");
            }
            System.out.println();
        }
    }
}
