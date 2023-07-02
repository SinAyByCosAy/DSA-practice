package StriverPractice.Arrays;

import java.util.Scanner;

public class MaxConsecutiveOnes {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size");
        int n = sc.nextInt();
        int nums[] = new int[n];
        System.out.println("Enter array elements");
        for(int i=0;i<n;i++){
            nums[i] = sc.nextInt();
        }
        int count = 0, maxCount = 0;
        for(int i=0;i<n;i++){
            if(nums[i] == 1){
                count ++;
            }
            if(nums[i] == 0 || i == n-1){
                maxCount = Math.max(count, maxCount);
                count = 0;
            }
        }
        System.out.println(maxCount);
    }
}
//TC -> O(N)
//SC -> O(1)