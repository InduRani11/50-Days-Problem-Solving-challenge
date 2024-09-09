public class MissingNumberLC{

    public static int missingNumber(int[] nums) {
        int sm=0;
        for(int i=0;i<nums.length;i++){
            sm=sm+nums[i];
        }
        return (nums.length+1)*nums.length/2 - sm;
    }
    public static void main(String arg[]){
        int nums[] = {3,0,1};
        System.out.println(missingNumber(nums));
    }
}