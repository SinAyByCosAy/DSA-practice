//https://leetcode.com/problems/rotate-array/description/
package StriverPractice.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class RotateArrayByKSteps {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size");
        int n = sc.nextInt();
        int nums[] = new int[n];
        System.out.println("Enter array elements");
        for(int i=0;i<n;i++){
            nums[i] = sc.nextInt();
        }
        System.out.println("Enter no of rotations");
        int k = sc.nextInt();
        k = k % n;
        reverse(nums, 0, n-1);
        reverse(nums, 0, k-1);
        reverse(nums, k, n-1);
        System.out.println(Arrays.toString(nums));
    }
    static void reverse(int arr[], int i, int j){
        while(i<=j){
            int t = arr[i];
            arr[i] = arr[j];
            arr[j] = t;
            i++;
            j--;
        }
    }
}
//TC -> O(N)
//SC -> O(1)