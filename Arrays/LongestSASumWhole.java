//https://www.codingninjas.com/studio/problems/longest-subarray-with-sum-k_6682399?utm_source=youtube&utm_medium=affiliate&utm_campaign=striver_Arrayproblems
package StriverPractice.Arrays;

import java.util.Scanner;

public class LongestSASumWhole {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array length");
        int n = sc.nextInt();
        int a[] = new int[n];
        System.out.println("Enter array elements");
        for(int i=0;i<n;i++){
            a[i] = sc.nextInt();
        }
        System.out.println("Enter sum");
        int k = sc.nextInt();
        int l = 0, r = 0, len = 0;
        long sum = 0;
        while(r < n){
            sum += a[r];
            while(sum > k){
                sum -= a[l];
                l++;
            }
            if(sum == k){
                len = Math.max(len, r-l+1);
            }
            r++;
        }
        System.out.println(len);
    }
}
//TC -> O(N)
//SC -> O(1)