/*
Input Format: N = 3
Result:
A
A B
A B C

Input Format: N = 6
Result:
A
A B
A B C
A B C D
A B C D E
A B C D E F
 */
package StriverPractice.Patterns;

import java.util.Scanner;

public class Pattern14 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=1;i<=n;i++){
//            Option 1
//            char ch = 'A';
//            for(int j=1;j<=i;j++){
//                System.out.print(ch++ + " ");
//            }

//            Option 2
            for(char j='A';j<'A'+i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
