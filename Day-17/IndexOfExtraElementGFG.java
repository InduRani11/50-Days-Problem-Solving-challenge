public class IndexOfExtraElementGFG {
    public static int findExtra(int n, int arr1[], int arr2[]) {
        int i=0;
        int j=n;
        if(arr1[arr1.length-1]!=arr2[arr2.length-1]){
            return n;
        }
        while(i<=j){
            int mid=(i+j)/2;
            if(arr1[mid-1]==arr2[mid-1]&&arr1[mid]!=arr2[mid]){
                return mid;
            }
            if(arr1[mid]==arr2[mid]){
                i=mid+1;
            }
            else{
                j=mid-1;
            }
        }
        return -1;

    }
    public static void main(String[] args) {
        int  n = 7, arr1[] = {2,4,6,8,9,10,12}, arr2[] = {2,4,6,8,10,12};
        System.out.println(findExtra(n, arr1, arr2));
    }

}
