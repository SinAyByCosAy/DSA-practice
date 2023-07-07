//https://leetcode.com/problems/majority-element-ii/description/
package StriverPractice.Arrays;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MajorityElement2 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter array elements");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(majorityElement2(arr));
    }
    public static List<Integer> majorityElement2(int[] arr) {
        int cme1 = -1;
        int freq1 = 0;
        int cme2 = -1;
        int freq2 = 0;
        int n = arr.length;
        for(int i=0;i<n;i++){
            if(arr[i] == cme1){
                freq1++;
            }else if(arr[i] == cme2){
                freq2++;
            }
            else if(freq1 == 0){
                cme1 = arr[i];
                freq1 = 1;
            }else if(freq2 == 0){
                cme2 = arr[i];
                freq2 = 1;
            }else{
                freq1--;
                freq2--;
            }
        }
        boolean flag1 = (freq1 > 0) ? true : false; //check if cme even exists or not
        boolean flag2 = (freq2 > 0) ? true : false;
        int count1 = 0;
        int count2 = 0;
        for(int i=0;i<n;i++){
            if(flag1 && arr[i] == cme1){
                count1++;
            }
            else if(flag2 && arr[i] == cme2){
                count2++;
            }
        }
        List<Integer> result = new ArrayList<>();
        if(count1 > n/3){
            result.add(cme1);
        }
        if(count2 > n/3){
            result.add(cme2);
        }
        return result;
    }
}
//TC -> O(N)
//SC -> O(1)