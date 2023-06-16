package StriverPractice.BasicRecursion;

import java.util.Scanner;

public class SumFirstNNatural {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        SumFirstNNatural obj = new SumFirstNNatural();
        System.out.println(obj.sum(n));
    }
    int sum(int n){
        if(n == 0)
            return 0;
        return n + sum(n-1);
    }
}
