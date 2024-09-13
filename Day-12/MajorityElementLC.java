public class MajorityElementLC{
    public static int majorityElement(int[] nums) {
        int val=0;
        int ctMax=0;
        int count=1;
        for(int i=0;i<nums.length-1;i++){
            count=1;
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]==nums[j]){
                    count++;
                }
            }
            if(count>ctMax){
                val=i;
            }
            ctMax=Math.max(ctMax,count);

        }
        return nums[val];
    }
    public static void main(String[] args) {
        int nums[] = {3,2,3};
        System.out.println(majorityElement(nums));
    }
}