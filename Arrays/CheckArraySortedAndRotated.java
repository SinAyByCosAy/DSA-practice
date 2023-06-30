//https://leetcode.com/problems/check-if-array-is-sorted-and-rotated/
package StriverPractice.Arrays;

import java.util.Scanner;

public class CheckArraySortedAndRotated {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size");
        int n = sc.nextInt();
        int nums[] = new int[n];
        System.out.println("Enter array elements");
        for(int i=0;i<n;i++){
            nums[i] = sc.nextInt();
        }
        int count = 0;
        boolean flag = true;
        for(int i=0;i<n;i++){
            if(nums[i] > nums[(i+1) % n]){
                count ++;
            }
            if(count == 2){
                flag = false;
                break;
            }
        }
        System.out.println(flag);
    }
}
