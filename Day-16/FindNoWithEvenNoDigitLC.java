public class FindNoWithEvenNoDigitLC {
    public static int findNumbers(int[] nums) {
        int count=0;
        for(int i=0;i<nums.length;i++){
            if(Integer.toString(nums[i]).length()%2==0){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int nums[] = {555,901,482,1771};
        System.out.println(findNumbers(nums));
    }
}
