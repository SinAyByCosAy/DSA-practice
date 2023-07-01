package StriverPractice.Arrays;

import java.util.Scanner;

public class LinearSearch {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter array elements");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter search element");
        int k = sc.nextInt();
        int index = -1;
        for(int i=0;i<n;i++){
            if(arr[i] == k){
                index = i;
                break;
            }
        }
        System.out.println(index);
    }
}
