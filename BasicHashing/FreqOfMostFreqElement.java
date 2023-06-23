/*
URL: https://leetcode.com/problems/frequency-of-the-most-frequent-element/description/
Input: nums = [1,4,8,13], k = 5
Output: 2
Explanation: There are multiple optimal solutions:
- Increment the first element three times to make nums = [4,4,8,13]. 4 has a frequency of 2.
- Increment the second element four times to make nums = [1,8,8,13]. 8 has a frequency of 2.
- Increment the third element five times to make nums = [1,4,13,13]. 13 has a frequency of 2.
 */
package StriverPractice.BasicHashing;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
import java.util.TreeMap;

public class FreqOfMostFreqElement {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        Arrays.sort(arr);
        int L = 0;
        int R = 0;
        int maxCount = 0;
        long currTotal = 0;
        while(R != n){

            int noOfEle = R - L + 1;
            currTotal += arr[R];
            if( noOfEle * arr[R] > currTotal + k){
                currTotal -= arr[L];
                L ++;
            }else{
                maxCount = Math.max(maxCount, noOfEle);
            }
            R ++;
        }
        System.out.println(maxCount);
    }
}
//TC -> O(N.log(N))
//SC -> O(1)