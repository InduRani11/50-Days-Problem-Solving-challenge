

public class MinimumInRotatedSortedArrayLC {
    public static int findMin(int[] nums) {
        int i=1;
        int j=nums.length-1;

        while(i<=j){
            int mid=(i+j)/2;
            if(nums[mid]<nums[mid-1]){
                return nums[mid];
            }

            if(nums[mid]<nums[0]){
                j=mid-1;
            }
            else if(nums[mid]>nums[nums.length-1]){
                i=mid+1;
            }else{
                i++;j--;
            }
        }
        return nums[0];
    }
    public static void main(String[] args) {
        int nums[] = {4,5,6,7,0,1,2};
        System.out.println(findMin(nums));
    }
}
