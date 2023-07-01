//https://takeuforward.org/data-structure/union-of-two-sorted-arrays/
package StriverPractice.Arrays;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UnionOfSortedArrays {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array 1 size");
        int n = sc.nextInt();
        int a[] = new int[n];
        System.out.println("Enter array 1 elements");
        for(int i=0;i<n;i++){
            a[i] = sc.nextInt();
        }
        System.out.println("Enter array 2 size");
        int m = sc.nextInt();
        int b[] = new int[n];
        System.out.println("Enter array 2 elements");
        for(int i=0;i<m;i++){
            b[i] = sc.nextInt();
        }

        List<Integer> list = new ArrayList<>();
        int i = 0, j= 0;
        while(i < n && j < m){
            if(a[i] <= b[j]){
                if(list.size() == 0 || list.get(list.size()-1) != a[i])
                    list.add(a[i]);
                i++;
            }else{
                if(list.size() == 0 || list.get(list.size()-1) != b[j])
                    list.add(b[j]);
                j++;
            }
        }
        while(i < n){
            if(list.get(list.size()-1) != a[i])
                list.add(a[i]);
            i++;
        }
        while(j < m){
            if(list.get(list.size()-1) != b[j])
                list.add(b[j]);
            j++;
        }
        System.out.println(list);
    }
}
//TC -> O(N+M)
//SC -> O(1)