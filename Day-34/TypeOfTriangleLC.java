import java.util.*;
public class TypeOfTriangleLC{
    public static String triangleType(int[] nums) {
        Arrays.sort(nums);
        if(nums[0]+nums[1]<=nums[2]){
            return "none";
        }
        if(nums[0]==nums[1]&&nums[1]==nums[2]){
            return "equilateral";
        }
        if(nums[0]!=nums[1]&&nums[1]!=nums[2]&&nums[0]!=nums[2]){
            return "scalene";
        }else{
            return "isosceles";
        }
    }
    public static void main(String arg[]){
        int nums[] = {3,3,3};
        System.out.println(triangleType(nums));
    }
}