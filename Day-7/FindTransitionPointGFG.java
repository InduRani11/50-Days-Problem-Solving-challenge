
public class FindTransitionPointGFG {
    public static int transitionPoint(int arr[], int n) {
        int i=0;
        int j=n-2;
        if(arr[0]==1){
            return 0;
        }
        while(i<j){
            int mid=(i+j)/2;
            if(arr[mid]==1 && arr[mid-1]==0){
                return mid;
            }else if(arr[mid]==0 &&arr[mid+1]==1){
                return mid+1;
            }else if(arr[mid]==0){
                i=mid+1;
            }else{
                j=mid-1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int N = 5;
        int arr[] = {0,0,0,1,1};
        System.out.println(transitionPoint(arr, N));
    }
}
