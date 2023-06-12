/*
Input Format: N = 3
Result:
C
B C
A B C

Input Format: N = 6
Result:
F
E F
D E F
C D E F
B C D E F
A B C D E F
 */
package StriverPractice.Patterns;

import java.util.Scanner;

public class Pattern18 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=1;i<=n;i++){
//            Option 1
//            char row_ele = (char)('A' + (n-i));
//            for(int j=1;j<=i;j++){
//                System.out.print(row_ele++ + " ");
//            }
//            System.out.println();
//            Option 2
            for(char row_ele=(char)('A'+(n-i));row_ele<'A'+n;row_ele++){
                System.out.print(row_ele+" ");
            }
            System.out.println();
        }
    }
}
