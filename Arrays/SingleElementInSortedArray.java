package StriverPractice.Arrays;

import java.util.Scanner;

public class SingleElementInSortedArray {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter array elements");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        //BS
        System.out.println(findSingleEle(arr));
    }
    static int findSingleEle(int arr[]){
        int n = arr.length;
        if(n == 1) return arr[0];
        if(arr[0] != arr[1]) return arr[0];
        if(arr[n-1] != arr[n-2]) return arr[n-1];
        int start = 1;
        int end = n - 2;
        while(start <= end){
            int mid = (start+end) / 2;
            if(arr[mid] != arr[mid + 1] && arr[mid] != arr[mid - 1]){
                return arr[mid];
            }
            //elimination
            if(((mid % 2 == 1) && (arr[mid] == arr[mid - 1])) || (mid % 2 == 0) && (arr[mid] == arr[mid + 1])){
                start = mid + 1;
            }
            else{
                end = mid - 1;
            }
        }
        return -1;
    }
}
//TC -> O(log N)
//SC -> O(N)