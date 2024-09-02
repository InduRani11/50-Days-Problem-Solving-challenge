/*
 * Given an array arr of n positive integers, your task is to find all the leaders in the array.
 *  An element of the array is considered a leader if it is greater than all the elements on its right side
 *  or if it is equal to the maximum element on its right side. The rightmost element is always a leader.
 */

import java.util.ArrayList;

public class ArrayLeaderGFG {
    public static void leaders(int n, int arr[]) {
        int max=0;
        ArrayList<Integer> ar=new ArrayList<>();
        for(int i=n-1;i>=0;i--){
            max=Math.max(max,arr[i]);
            if(arr[i]==max){
                ar.add(arr[i]);
            }
        }
        for(int i=0;i<ar.size()/2;i++){
            int temp=ar.get(i);
            ar.set(i,ar.get(ar.size()-1-i));
            ar.set(ar.size()-1-i,temp);
        }
        for(int i=0;i<ar.size();i++){
            System.out.println(ar.get(i));
        }
    }
    public static void main(String[] args) {
        int  n = 6;
        int arr[] = {16,17,4,3,5,2};
        leader(n,arr);
    }
}
