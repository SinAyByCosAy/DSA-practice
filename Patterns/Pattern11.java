package StriverPractice.Patterns;

import java.util.Scanner;

public class Pattern11 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=1;i<=n;i++){
            int start_bit = (i%2 == 1) ? 1 : 0;
            for(int j=1;j<=i;j++){
                System.out.print(start_bit + " ");
                start_bit ^= 1;
            }
            System.out.println();
        }
    }
}
