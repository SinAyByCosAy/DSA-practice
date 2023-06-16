package StriverPractice.BasicRecursion;

import java.util.Scanner;

public class Factorial {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Factorial obj = new Factorial();
        System.out.println(obj.fact(n));
    }
    int fact(int n){
        if(n == 1)
            return 1;
        return n * fact(n-1);
    }
}
