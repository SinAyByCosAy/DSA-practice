package StriverPractice.BasicRecursion;

import java.util.Scanner;

public class ReverseArray {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for(int i=0;i<n;i++){
            a[i] = sc.nextInt();
        }
        System.out.println("Original Array");
        for(int ele : a){
            System.out.print(ele+" ");
        }
        System.out.println();
        ReverseArray obj = new ReverseArray();
        obj.rev(a, 0, n-1);

        System.out.println("Reversed Array");
        for(int ele : a){
            System.out.print(ele+" ");
        }
    }
    void rev(int[] a, int i, int j){
        if(i > j)
            return;
        int t = a[i];
        a[i] = a[j];
        a[j] = t;
        rev(a, i+1, j-1);
    }
}
