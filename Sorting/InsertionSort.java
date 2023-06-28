//Insertion sort
//Consider left side as the sorted side, pick one element from the right
//and compare with the last element from the left.
//If element on the right is greater, then we don't do anything and consider that also part of the sorted left side now
//If element on the right is smaller, then we swap them. Then the key element is checked against
//element on the further left. And we keep doing this comparison till the left side is not sorted.
package StriverPractice.Sorting;

import java.util.Arrays;
import java.util.Scanner;

public class InsertionSort {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter array elements");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        for(int i=0;i<n-1;i++){
            int key = i+1;
            int pre = i;
            while(pre >= 0 && arr[key] < arr[pre]){
                int t = arr[key];
                arr[key] = arr[pre];
                arr[pre] = t;
                key --;
                pre --;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}

//TC -> O(N^2)
//SC -> O(1)