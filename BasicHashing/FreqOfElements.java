/*
Example 1:
Input: arr[] = {10,5,10,15,10,5};
Output: 10  3
	    5   2
        15  1
Explanation: 10 occurs 3 times in the array
	         5 occurs 2 times in the array
             15 occurs 1 time in the array

Example2:
Input: arr[] = {2,2,3,4,4,2};
Output: 2  3
	    3  1
        4  2
Explanation: 2 occurs 3 times in the array
	         3 occurs 1 time in the array
             4 occurs 2 time in the array
 */
package StriverPractice.BasicHashing;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FreqOfElements {
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
        for(Map.Entry<Integer, Integer> entry: hm.entrySet()){
            System.out.println(entry.getKey()+" "+ entry.getValue());
        }
//        System.out.println(hm);
    }
}
//TC -> O(N)
//SC -> O(N)