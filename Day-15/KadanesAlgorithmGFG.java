public class KadanesAlgorithmGFG {
    public static int maxSubarraySum(int[] arr) {
        int max=Integer.MIN_VALUE;
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum=sum+arr[i];
            if(sum<0){
                sum=0;
            }
            max=Math.max(max,sum);
        }

        if(max==0){
            max=Integer.MIN_VALUE;
           for(int i=0;i<arr.length;i++){
                max=Math.max(max,arr[i]);
            }
            return max;
        }
        return max;
    }
    public static void main(String arg[]){
        int arr[] = {1, 2, 3, -2, 5};
        System.out.println(maxSubarraySum(arr));
    }
}
