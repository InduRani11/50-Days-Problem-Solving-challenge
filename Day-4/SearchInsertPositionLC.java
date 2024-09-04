/*
 * Given a sorted array of distinct integers and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.

You must write an algorithm with O(log n) runtime complexity.
 */


public class SearchInsertPositionLC {
    public static int searchInsert(int[] nums, int target) {
        int left =0;
        int right=nums.length-1;
        while(left<=right){
            int mid=left+(right-left)/2;
            if(nums[mid]==target){
                return mid;
            }
            if(mid<nums.length-1){
                if(nums[mid]<target && nums[mid+1]>target){
                    return mid +1;
                }
            }
            if(nums[nums.length-1]<target){
                return nums.length;
            }
            if(nums[0]>target){
                return 0;
            }
            if(nums[mid]<target){
                left=mid+1;
            }else{
                right=mid-1;
            }

        }
        return -1;
    }
    public static void main(String[] args) {
        int nums[] = {1,3,5,6};
        int target = 5;
        System.out.println(searchInsert(nums, target));
    }
}
