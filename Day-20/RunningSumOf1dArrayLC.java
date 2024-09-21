

public class RunningSumOf1dArrayLC {
    public static void runningSum(int[] nums) {
        int arr[]=new int[nums.length];
        arr[0]=nums[0];
        for(int i=1;i<nums.length;i++){
            arr[i]=arr[i-1]+nums[i];
        }
        for(int i=1;i<nums.length;i++){
            System.out.print(arr[i]+", ");
        }

    }
    public static void main(String[] args) {
        int nums[] = {1,2,3,4};
        runningSum(nums);
    }
}
