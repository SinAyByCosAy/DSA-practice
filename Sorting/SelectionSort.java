//Selection sort
package StriverPractice.Sorting;

import java.util.Arrays;
import java.util.Scanner;

public class SelectionSort {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter array elements");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        for(int i=0;i<n;i++){
            int pos = i;
            for(int j=i+1;j<n;j++){
                if(arr[j] < arr[pos]){
                    pos = j;
                }
            }
            int t = arr[i];
            arr[i] = arr[pos];
            arr[pos] = t;
        }
        System.out.println(Arrays.toString(arr));
    }
}
