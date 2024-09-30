

public class KthSmallestGFG {
    public static int kthSmallest(int[] arr, int k) {
        int max=0;
        int min=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            max=Math.max(max,arr[i]);
            min=Math.min(min,arr[i]);
        }
        int ar[]=new int[max+1-min];
        for(int i=0;i<arr.length;i++){
            ar[arr[i]-min]++;
        }
        int x=0;
        for(int i=0;i<ar.length;i++){
            if(ar[i]>0){
                x=x+ar[i];
            }
            if(x>=k){
                return i+min;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[] = {7, 10, 4, 3, 20, 15}, k = 3;
        System.out.println(kthSmallest(arr,k));
    }
}
