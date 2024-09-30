
public class SearchInRotatedArrayLC{
    public static int search(int[] arr, int target) {
        int si=0;
        int ei=arr.length-1;
        while(si<=ei){
            int mid = si + (ei - si) / 2;
            // case found

            if (target == arr[mid]) {
                return mid;
            }
            // mid on L1
            if (arr[si] <= arr[mid]) {
                // case a :- left
                if (arr[si] <= target && target <= arr[mid]) {
                    ei=mid-1;
                }
                // case d:- right
                else {
                    si=mid + 1;
                }
            }
            if (arr[mid] <= arr[ei]) {
            // case c :- right
                if (arr[mid] <= target && target <= arr[ei]) {
                    si=mid + 1;
                }
            // case d:- left
                else {
                    ei=mid - 1;
                }
            }
        }
        return -1;

    }
    public static void main(String[] args) {
        int nums[] = {4,5,6,7,0,1,2}, target = 0;
        System.out.println(search(nums, target));
    }
}