package StriverPractice.BasicRecursion;

import java.util.Scanner;

public class Print1ToN {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Print1ToN obj = new Print1ToN();
        obj.printNos(n);
    }
    void printNos(int n){
        if(n == 0)
            return;
        printNos(n-1);
        System.out.println(n);
    }
}
