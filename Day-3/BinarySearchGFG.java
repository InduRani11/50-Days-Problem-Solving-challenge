public class BinarySearchGFG {
    public static int binarysearch(int[] arr, int k) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == k) {
                return mid;
            }

            if (arr[mid] < k) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return -1;
    }
    public static void main(String[] args) {
        int k = 4;
        int arr[]= {1, 2, 3, 4, 5};
        int posIndex = binarysearch(arr, k);
        System.out.println("Position Index is :-"+posIndex);
    }
}
