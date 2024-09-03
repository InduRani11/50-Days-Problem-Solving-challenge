

public class RemoveElementLC {
    public static int removeElement(int[] arr, int val) {
        int l=0,r=arr.length-1;
        if(r<0||(r==0&&arr[0]==val)){
            return 0;
        }else if(r==0&&arr[0]!=val){
            return 1;
        }
        while(l<=r){
            if(arr[l]==val&& arr[r]!=val){
                int t=arr[l];
                arr[l]=arr[r];
                arr[r]=t;

            }
            if(arr[r]==val){
                r--;
            }else if(arr[l]!=val){
                l++;
            }
        }
        if(r==arr.length-1){
            return arr.length;
        }
        return r+1;
    }
    public static void main(String[] args) {
        int nums[] = {3,2,2,3};
        int val = 3;
        int end=removeElement(nums,val);
        for(int i=0;i<end;i++){
            System.out.print(nums[i]+" ");
        }
    }
}
