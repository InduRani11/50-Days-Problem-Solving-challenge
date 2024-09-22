public class CountTheZerosGFG {

    public static int countZeroes(int[] arr) {
        int i=1;
        int j=arr.length-1;
        if(arr[0]==0){
            return arr.length;
        }
        while(i<=j){
            int mid=(i+j)/2;
            if(arr[mid-1]==1&&arr[mid]==0){
                return arr.length-mid;
            }
            if(arr[mid]==0){
                j=mid-1;
            }if(arr[mid]==1){
                i=mid+1;
            }
        }
        return 0;
    }
    public static void main(String[] args) {
        int arr[] = {1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 0, 0};
        System.out.println(countZeroes(arr));
    }
}
