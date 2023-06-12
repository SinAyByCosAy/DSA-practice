/*
Input Format: N = 3
Result:
A B C
A B
A

Input Format: N = 6
Result:
A B C D E F
A B C D E
A B C D
A B C
A B
A
 */
package StriverPractice.Patterns;

import java.util.Scanner;

public class Pattern15 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=n;i>=1;i--){
            for(char j='A';j<'A'+i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
