package StriverPractice.Sorting;

import java.util.Arrays;
import java.util.Scanner;

public class MergeSort {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter array elements");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        mergeSort(arr, 0, n-1);
        System.out.println(Arrays.toString(arr));
    }
    public static void mergeSort(int[] arr, int start, int end){
        if(start == end){
            return;
        }
        int m = (start + end)/2;
        mergeSort(arr, 0, m);
        mergeSort(arr, m+1, end);
        merge(arr, start, m, end);
    }
    public static void merge(int arr[], int start, int mid, int end){
        int c[] = new int[end - start + 1];
        int p1 = start;
        int p2 = mid + 1;
        int p3 = 0;
        while(p1<=mid && p2<=end){
            if(arr[p2] < arr[p1]){
                c[p3++] = arr[p2++];
            }else{
                c[p3++] = arr[p1++];
            }
        }
        while(p1<=mid){
            c[p3++] = arr[p1++];
        }
        while(p2<=end){
            c[p3++] = arr[p2++];
        }
        for(int i=0;i<end-start+1;i++){
            arr[start + i] = c[i];
        }
    }
}

//TC -> O(N * log N)
//SC -> O(N)