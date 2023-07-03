//https://www.codingninjas.com/studio/problems/longest-subarray-with-sum-k_5713505?utm_source=youtube&utm_medium=affiliate&utm_campaign=striver_Arrayproblems
package StriverPractice.Arrays;

import java.util.HashMap;
import java.util.Scanner;

public class LongestSASumIntegers {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array length");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter array elements");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter sum");
        int k = sc.nextInt();
        long sum = 0;
        int len = 0;
        HashMap<Long, Integer> hm = new HashMap<>();
        for(int i=0;i<arr.length;i++){
            sum += arr[i];
            if(sum == k){
                len = i+1;
            }
            long rem = sum - k;
            if(hm.containsKey(rem)){
                len = Math.max(len, i - hm.get(rem));
            }
            if(!hm.containsKey(sum)){
                hm.put(sum, i);
            }
        }
        System.out.println("Longest SA len : "+len);
    }
}
//TC -> O(N)
//SC -> O(N)
