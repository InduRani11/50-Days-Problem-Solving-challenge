/*
 * Given an array arr of size n which contains elements in range from 0 to n-1,
 * you need to find all the elements occurring more than once in the given array.
 *  Return the answer in ascending order. If no such element is found, return list containing [-1].
 */

import java.util.ArrayList;

public class FindDublicateInArrayGFG {
    public static ArrayList<Integer> duplicates(int[] arr) {
        ArrayList<Integer> ar= new ArrayList<>();
        int max=0;
        for(int i=0;i<arr.length;i++){
            max=Math.max(max,arr[i]);
        }
        int count[]=new int[max+1];

        for(int i=0;i<arr.length;i++){
            count[arr[i]]++;
        }

        for(int m=0, i=0;i<count.length;i++){
            if(count[i]>=2){
                ar.add(i);
            }

        }
        if(ar.isEmpty()){
            ar.add(-1);
        }

        return ar;
    }
    public static void main(String[] args) {
        int  n = 4;
        int arr[] = {0,3,1,2};
        duplicates(arr);
    }
}
