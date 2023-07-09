//https://leetcode.com/problems/majority-element/description/
package StriverPractice.Arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class MajoritElement1Variation {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter array elements");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        if(n == 1) {
            System.out.println(arr[0]);
            return;
        }
        ArrayList<Integer> list = new ArrayList<>();//list to hold arranged values
        ArrayList<Integer> stack = new ArrayList<>();//stack to hold extra values, using it as ArrayList
        list.add(arr[0]);
        for(int i=1;i<n;i++){
            if(arr[i] != list.get(list.size()-1)){//when current element != last ele of list, add it in the list
                list.add(arr[i]);
                if(stack.size() != 0){//if stack is not empty then add the element from there as well to the list
                    int ele = stack.remove(stack.size()-1);
                    list.add(ele);
                }
            }else{//if current ele == last ele of list, then add it to the stack
                stack.add(arr[i]);
            }
        }

        int cme = list.get(list.size()-1);
        int listIndex = list.size() - 1 - 2;// -2 because the first pair from the last has to get eliminated always
        int stackIndex = stack.size() - 1;
        while(listIndex > 0){//verification process
            if(list.get(listIndex) == cme){//if the last ele == cme, we remove one pair from the list
                listIndex = listIndex - 2;
            }else{//if the ele != cme
                listIndex = listIndex - 1;//we remove that element
                if(stackIndex >= 0){//and we remove cme from stack making it a pair elimination again
                    stackIndex--;
                }else{//if we can't make pair that means there are not enough CMEs. Therefore answer = -1
                    System.out.println(-1);
                    return;
                }
            }
        }
        //index -1 -> stack me hona chahiye
        //index 0 -> same hai cme to answer hai, varna stack me do elements hone chahiye(1 to pair up and 1 extra)
        if(listIndex < 0){//either we have eliminated all the elements from the stack
            if(stackIndex >= 0) {//then answer has to be in the stack
                System.out.println(cme);
                return;
            }
        }
        if(listIndex == 0){//or we have one element remaining in the list
            if(list.get(0) == cme || stackIndex > 0) {//either that element is cme itself or there are 2 CMEs at least in stack to pair one with the non cme element and one extra for the answer
                System.out.println(cme);
                return;
            }
        }
        System.out.println(-1);
        return;
    }
}
//TC -> O(N)
//SC -> O(N)