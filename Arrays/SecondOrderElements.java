//Find second largest and second smallest elements
package StriverPractice.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class SecondOrderElements {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size");
        int n = sc.nextInt();
        int a[] = new int[n];
        System.out.println("Enter array elements");
        for(int i=0;i<n;i++){
            a[i] = sc.nextInt();
        }
        int largest = Integer.MIN_VALUE, secondLargest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE, secondSmallest = Integer.MAX_VALUE;
        int result[] = new int[2];
        for(int i=0;i<n;i++){
            if(a[i] >= largest){
                secondLargest = largest;
                largest = a[i];
            }else if(a[i] > secondLargest){
                secondLargest = a[i];
            }
            if(a[i] <= smallest){
                secondSmallest = smallest;
                smallest = a[i];
            }else if(a[i] < secondSmallest){
                secondSmallest = a[i];
            }
        }
        result[0] = secondLargest;
        result[1] = secondSmallest;
        System.out.println(Arrays.toString(result));
    }
}
//TC -> O(N)
//SC -> O(1)