//Quick Sort
//Only thing to remember,
//purpose is to choose a pivot element and make it reach to the correct spot
//in the process, left of the pivot should be elements smaller and right should be elements larger(in any order)
package StriverPractice.Sorting;

import java.util.Arrays;
import java.util.Scanner;

public class QuickSort {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter array elements");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        quickSort(arr, 0, n-1);
        System.out.println(Arrays.toString(arr));
    }
    public static void quickSort(int arr[], int start, int end){
        if(start >= end){
            return;
        }
        int pivot = arr[end];
        int pos = start;//this position tells us where the smaller elements should be placed, including pivot element
        for(int i=start;i<end;i++){
            if(arr[i] < pivot){
                swap(arr, i, pos);
                pos++;//moving to the next element that could lead to a possible swap
            }
        }
        swap(arr, end, pos);//placing pivot element to the correct position
        quickSort(arr, 0, pos-1);//dividing array
        quickSort(arr, pos+1, end);
    }
    public static void swap(int arr[], int i, int j){
        int t = arr[i];
        arr[i] = arr[j];
        arr[j] = t;
    }
}

//TC -> O(N * LogN)  Iterating over array at each step * dividing the array into half at each step
//SC -> O(1) + O(logN)  At max there will be logN active stack calls
