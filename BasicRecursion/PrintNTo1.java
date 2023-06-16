package StriverPractice.BasicRecursion;

import java.util.Scanner;

public class PrintNTo1 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        PrintNTo1 obj = new PrintNTo1();
        obj.printNos(n);
    }
    void printNos(int n){
        if(n == 0)
            return;
        System.out.println(n);
        printNos(n-1);
    }
}
