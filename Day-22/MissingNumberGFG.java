public class MissingNumberGFG {
    public static int missingNumber(int n, int[] arr) {
        int sm=0;
        for(int i=0;i<arr.length;i++){
            sm=sm+arr[i];
        }
        return (n*(n+1)/2)-sm;
    }
    public static void main(String[] args) {
        int n = 4, arr[] = {1,  4,  3};
        System.out.println(missingNumber(n, arr));
    }
}
