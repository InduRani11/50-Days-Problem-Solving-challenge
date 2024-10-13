public class MovesZeroesLC {
    public static void moveZeroes(int[] nums) {
        int j = 0, t;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                t = nums[i];
                nums[i] = nums[j];
                nums[j] = t;
                j++;
            }
        }
    }
    public static void main(String[] args) {
        int nums[]={0,1,0,3,12};
        moveZeroes(nums);
    }
}
