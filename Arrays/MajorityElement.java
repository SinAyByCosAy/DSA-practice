//https://leetcode.com/problems/majority-element/description/
package StriverPractice.Arrays;

import java.util.Scanner;

public class MajorityElement {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter array elements");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(majorityElement(arr));
    }
    public static int majorityElement(int[] arr) {
        int n = arr.length;
        int cme = -1;
        int freq = 0;
        for(int i=0;i<n;i++){
            if(freq == 0){
                cme = arr[i];
                freq = 1;
            }else if(arr[i] == cme){
                freq ++;
            }else{
                freq --;
            }
        }
        int count = 0;
        if(freq>0){
            for(int i=0;i<n;i++){
                if(arr[i] == cme){
                    count ++;
                }
            }
        }
        if(count > n/2)
            return cme;
        return -1;
    }
}
//TC -> O(N)
//SC -> O(1)