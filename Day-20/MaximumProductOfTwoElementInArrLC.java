

public class MaximumProductOfTwoElementInArrLC {
    public static int maxProduct(int[] nums) {
        for(int i=0;i<2;i++){
             for(int j=0;j<nums.length-1;j++){
                 if(nums[j]>nums[j+1]){
                     int t=nums[j];
                     nums[j]=nums[j+1];
                     nums[j+1]=t;
                 }
             }
        }
        return (nums[nums.length-1]-1)*(nums[nums.length-2]-1);
     }
     public static void main(String[] args) {
        int nums[] = {3,4,5,2};
        System.out.println(maxProduct(nums));
     }
}
