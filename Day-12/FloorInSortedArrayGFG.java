public class FloorInSortedArrayGFG {
    public static int findFloor(long arr[], int n, long x) {
        if(arr[0]>x){
            return -1;
        }
        if(arr[arr.length-1]<x){
            return arr.length-1;
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]>x){
                return i-1;
            }
            if(arr[i]==x){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int n = 7;
        long x = 0;
        long arr[] = {1,2,8,10,11,12,19};
        System.out.println(findFloor(arr, n, x));
    }
}
