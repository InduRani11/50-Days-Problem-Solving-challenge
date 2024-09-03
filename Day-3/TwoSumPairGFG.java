/*
 * Given an array arr of positive integers and another number x. Determine whether two elements exist in
 *  arr whose sum is exactly x or not.
 * Return a boolean value true if two elements exist in arr else return false.
 */
import java.util.*;
public class TwoSumPairGFG {
    public static boolean hasArrayTwoCandidates(int arr[], int x) {
        Arrays.sort(arr);
        int left=0, right=arr.length-1;
        while(left<right){
            if(arr[left]+arr[right]==x){
                return true;
            }else if(arr[left]+arr[right]>x){
                right--;
            }
            else if(arr[left]+arr[right]<x){
                left++;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int x = 16;
        int arr[] = {1, 4, 45, 6, 10, 8};
        System.out.println(hasArrayTwoCandidates(arr, x));
    }
}
