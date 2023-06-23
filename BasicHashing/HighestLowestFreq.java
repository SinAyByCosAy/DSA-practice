/*
Example 1:
Input: array[] = {10,5,10,15,10,5};
Output: 10 15
Explanation: The frequency of 10 is 3, i.e. the highest and the frequency of 15 is 1 i.e. the lowest.

Example 2:

Input: array[] = {2,2,3,4,4,2};
Output: 2 3
Explanation: The frequency of 2 is 3, i.e. the highest and the frequency of 3 is 1 i.e. the lowest.
 */
package StriverPractice.BasicHashing;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HighestLowestFreq {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        HashMap<Integer, Integer> hm = new HashMap<>();
        for(int i=0;i<n;i++){
            hm.put(arr[i], hm.getOrDefault(arr[i], 0)+1);
        }
        int maxFreq = Integer.MIN_VALUE, minFreq = Integer.MAX_VALUE;
        int maxEle=-1, minEle=-1;
        for(Map.Entry<Integer, Integer> entry : hm.entrySet()){
            int freq = entry.getValue();
            int ele = entry.getKey();
            if(freq > maxFreq){
                maxFreq = freq;
                maxEle = ele;
            }
            if(freq < minFreq){
                minFreq = freq;
                minEle = ele;
            }
            // we use both conditions as 'if' and not 'if-else' because we want both conditions to be checked
            // for the scenario when there is only one kind of element present in the array [1,1,1]. Both max and min will be same.
        }
        System.out.println(maxEle +" "+minEle);
    }
}
