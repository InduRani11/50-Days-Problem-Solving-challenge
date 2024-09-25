
public class IndexOfAnExtraElementGFG {
    public static int findExtra(int n, int arr1[], int arr2[]) {
        int i=0;
        int j=arr2.length-1;
        while(i<=j){
            int mid=(i+j)/2;
            if(arr1[mid]==arr2[mid]&&arr1[mid+1]!=arr2[mid+1]){
                return mid+1;
            }

            if(arr1[mid]==arr2[mid]){
                i=mid+1;
            }
            if(arr1[mid]!=arr2[mid]){
                j=mid-1;
            }
        }
        return -1;
    }
    public static void main(String arg[]){
        int n = 7, arr1[] = {2,4,6,8,9,10,12}, arr2[] = {2,4,6,8,10,12};
        System.out.println(findExtra(n, arr1, arr2));
    }
}
