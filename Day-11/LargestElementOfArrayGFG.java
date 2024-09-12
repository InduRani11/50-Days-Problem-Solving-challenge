
public class LargestElementOfArrayGFG {
    public static int largest(int[] arr) {
        int max=0;
        for(int i=0;i<arr.length;i++){
            max=Math.max(max,arr[i]);
        }
        return max;
    }
    public static void main(String[] args) {
        int arr[] = {1, 8, 7, 56, 90};
        System.out.println(largest(arr));
    }
}
