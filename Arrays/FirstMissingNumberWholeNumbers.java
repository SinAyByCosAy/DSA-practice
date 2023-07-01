//https://leetcode.com/problems/missing-number/description/
package StriverPractice.Arrays;

import java.util.Scanner;

public class FirstMissingNumberWholeNumbers {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size");
        int n = sc.nextInt();
        int nums[] = new int[n];
        System.out.println("Enter array elements");
        for(int i=0;i<n;i++){
            nums[i] = sc.nextInt();
        }

        int rangeSum = n * (n + 1) / 2;
        int arraySum = 0;

        for(int num : nums){
            arraySum += num;
        }
        System.out.println(rangeSum - arraySum);
    }
}
//TC -> O(N)
//SC -> O(1)

//Another solution - Send elements to correct location
/*
public int missingNumber(int[] nums) {
        int i = 0;
        int n = nums.length;
        while(i<n){
            if(nums[i]>=n || nums[i]==i){
                i++;
            }else{
                swap(nums, i, nums[i]);
            }
        }
        for(i=0;i<n;i++){
            if(nums[i] != i){
                return i;
            }
        }
        return n;
    }
    static void swap(int nums[], int i, int j){
        int t = nums[i];
        nums[i] = nums[j];
        nums[j] = t;
    }
 */