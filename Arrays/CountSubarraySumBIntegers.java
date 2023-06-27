//https://leetcode.com/problems/subarray-sum-equals-k/
package StriverPractice.Arrays;

import java.util.HashMap;
import java.util.Scanner;

public class CountSubarraySumBIntegers {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array");
        int n = sc.nextInt();
        System.out.println("Enter array elements");
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter sum");
        int k = sc.nextInt();
        HashMap<Long, Integer> hm = new HashMap<>();
        int count = 0;
        long sum = 0;
        for(int i=0;i<n;i++){
            sum += arr[i];
            if(sum == k){//if the prefix sum == K, then we found one SA from start
                count += 1;
            }
            long rem = sum - k;
            if(hm.containsKey(rem)){//if we found a SA with sum K, then we add it's count
                count += hm.get(rem);
            }
            hm.put(sum, hm.getOrDefault(sum, 0)+1);//in the end we update the count of the prefix sum
        }
        System.out.println(count);
    }
}

//TC -> O(N)
//SC -> O(N)
