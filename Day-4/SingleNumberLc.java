

public class SingleNumberLC{
    public static int singleNumber(int[] nums) {
        for(int i=0;i<nums.length;i++){
            int count=0;
            for(int j=0;j<nums.length ;j++){
                if(j==i){
                    continue;
                }
                if(nums[i]==nums[j]){
                    count++;
                }
            }
            if(count==0){
                return nums[i];
            }
        }
        return -1;

    }
    public static void main(String[] args) {
        int nums[] = {2,2,1};
        System.out.println("single no. :-"+singleNumber(nums));
    }
}