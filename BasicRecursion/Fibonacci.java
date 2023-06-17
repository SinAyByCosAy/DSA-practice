package StriverPractice.BasicRecursion;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        Fibonacci obj = new Fibonacci();
        System.out.println(obj.fibo(n));
    }
    int fibo(int n){
        if(n <= 1)
            return n;
        return fibo(n-1) + fibo(n-2);
    }
}
