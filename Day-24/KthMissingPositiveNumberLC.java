public class KthMissingPositiveNumberLC{
    public static int findKthPositive(int[] arr, int k) {
        int miss=arr[0]-1;
        if(miss==k){
            return arr[0]-1;
        }
        if(miss>k){
            return arr[0]-(miss-k)-1;
        }
        int i=0;
        for(i=1;i<arr.length;i++){
            miss=miss+arr[i]-arr[i-1]-1;
            if(miss>k){
                return arr[i]-(miss-k)-1;
            }
            if(miss==k){
                return arr[i]-1;
            }
        }

        if(miss<k){
            return arr[arr.length-1]+(k-miss);
        }
        return 0;
    }
    public static void main(String[] args) {
        int arr[] = {2,3,4,7,11}, k = 5;
        System.out.println(findKthPositive(arr, k));
    }
}