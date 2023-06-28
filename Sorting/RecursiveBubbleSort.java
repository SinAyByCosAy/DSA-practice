package StriverPractice.Sorting;

import java.util.Arrays;
import java.util.Scanner;

public class RecursiveBubbleSort {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter array elements");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        recursiveSort(arr, 0);
        System.out.println(Arrays.toString(arr));
    }
    public static void recursiveSort(int arr[], int start){//represents ith loop
        if(start == arr.length)
            return;
        recursivePushBack(arr, 0, start);
        recursiveSort(arr, start+1);
    }
    public static void recursivePushBack(int arr[], int start, int i){//represents jth loop
        if(start == arr.length-i-1)
            return;

        if(arr[start] > arr[start + 1]){
            swap(arr, start, start + 1);
        }
        recursivePushBack(arr, start + 1, i);
    }
    public static void swap(int arr[], int i, int j){
        int t = arr[i];
        arr[i] = arr[j];
        arr[j] = t;
    }
}
//TC -> O(N^2)
//SC -> O(N)