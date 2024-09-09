import java.util.*;
public class MaximumGapLC {
    public static int maximumGap(int[] nums) {
        Arrays.sort(nums);
        int gap=0;
        for(int i=0;i<nums.length-1;i++){
            gap=Math.max(gap,nums[i+1]-nums[i]);
        }
        return gap;
    }
    public static void main(String arg[]){
        int nums[] = {3,6,9,1};
        System.out.println(maximumGap(nums));
    }
}
