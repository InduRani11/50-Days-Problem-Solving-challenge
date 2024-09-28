public class findfirstandlastpositionofElementinSortedArrayLC {
    public static void searchRange(int[] nums, int target) {
        int arr[]=new int[2];
        arr[0]=-1;
        arr[1]=-1;
        int i=0;
        int j=nums.length-1;
        if(nums.length==0){
            // return arr;
            for(int k=0;k<arr.length;k++){
                System.out.print(arr[k]+" ");
            }
        }
        if(nums.length==1){
            if(nums[0]==target){
                arr[0]=0;
                arr[1]=0;
                // return arr;
                for(int k=0;k<arr.length;k++){
                    System.out.print(arr[k]+" ");
                }
            }else{
                // return arr;
                for(int k=0;k<arr.length;k++){
                    System.out.print(arr[k]+" ");
                }
            }
        }
        // int mid=(i+j)/2;
        if(nums[0]==target){
            arr[0]=0;
        }else{
            while(i<=j){
                int mid=(i+j)/2;
                if(nums[mid]==target&&nums[mid-1]!=target){
                    arr[0]=mid;
                    break;
                }
                if(nums[mid]<target){
                    i=mid+1;
                }else {
                    j=mid-1;
                }
            }
        }

        i=0;
        j=nums.length-1;
        if(nums[j]==target){
            arr[1]=j;
        }else{
            while(i<=j){
                int mid=(i+j)/2;
                if(nums[mid]==target&&nums[mid+1]!=target){
                    arr[1]=mid;
                    break;
                }
                if(nums[mid]>target){
                    j=mid-1;
                }else {
                    i=mid+1;
                }

            }
        }

        for(int k=0;k<arr.length;k++){
            System.out.print(arr[k]+" ");
        }
    }
    public static void main(String arg[]){
        int  nums[] = {5,7,7,8,8,10}, target = 8;
        searchRange(nums, target);
    }
}
