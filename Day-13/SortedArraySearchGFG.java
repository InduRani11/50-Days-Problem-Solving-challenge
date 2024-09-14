

public class SortedArraySearchGFG {
    public static int searchInSorted(int arr[], int N, int K) {

        int i=0;
        int j=N-1;
        while(i<=j){
            int mid=(i+j)/2;
            if(arr[mid]==K){
                return 1;
            }
            if(arr[mid]>K){
                j=mid-1;
            }else{
                i=mid+1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int N = 5, K = 6;
        int arr[] = {1,2,3,4,6};
        System.out.println(searchInSorted(arr, N, K));
    }
}
