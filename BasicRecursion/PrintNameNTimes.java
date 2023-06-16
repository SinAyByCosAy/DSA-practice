package StriverPractice.BasicRecursion;

import java.util.Scanner;

public class PrintNameNTimes {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        int n = sc.nextInt();

        PrintNameNTimes obj = new PrintNameNTimes();
        obj.printName(name, n);
    }
    void printName(String name, int n){
        if(n == 0)
            return;
        System.out.println(name);
        printName(name, n-1);
    }
}
