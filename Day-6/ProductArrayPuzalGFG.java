public class ProductArrayPuzalGFG {
    public static void productExceptSelf(int nums[]) {
        long mult=1;
        int count=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                count++;
                continue;
            }
            mult=mult*nums[i];
        }
        long arr[]=new long[nums.length];
        if(count==0){
            for(int i=0;i<nums.length;i++){
                arr[i]=mult/nums[i];
            }
        }
        else if(count==1){
            for(int i=0;i<nums.length;i++){
                if(nums[i]==0){
                    arr[i]=mult;
                }
                else{
                    arr[i]=0;
                }
            }
        }else{
            for(int i=0;i<nums.length;i++){
                arr[i]=0;
            }
        }

        for(int i=0;i<nums.length;i++){
            System.out.println(arr[i]);
        }
    }
    public static void main(String[] args) {
        int  nums[] = {10, 3, 5, 6, 2};
        productExceptSelf(nums);
    }
}
