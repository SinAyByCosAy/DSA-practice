//Bubble sort
//we swap adjacent elements continuously. So the larger element is always pushed back in each swap.
//eventually the largest element out of position reaches to the back of the array
package StriverPractice.Sorting;

import java.util.Arrays;
import java.util.Scanner;

public class BubbleSort {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter array elements");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        for(int i=0;i<n-1;i++){
            boolean swap = false;
            for(int j=0;j<n-i-1;j++){//why j is < n-i-1, everytime largest element is being placed at the back,
                //we don't need to go till that point again
                if(arr[j] > arr[j+1]){
                    int t = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = t;
                    swap = true;
                }
            }
            if(!swap){
                break;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
//TC -> O(N^2)
//SC -> O(1)
