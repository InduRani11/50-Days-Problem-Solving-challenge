import java.util.Arrays;

public class FindPairGivenDifferenceGFG {
    public static int findPair(int n, int x, int[] arr) {
        Arrays.sort(arr);
        int i = 0;
        int j = 1;

        while (i < n && j < n) {
            if (i != j && arr[j] - arr[i] == x) {
                return 1;
            } else if (arr[j] - arr[i] < x) {
                j++;
            } else {
                i++;
            }
        }

        return -1;
    }
    public static void main(String[] args) {
        int n = 6;
        int x = 78;
        int arr[] = {5, 20, 3, 2, 5, 80};
        System.out.println(findPair(n, x, arr));
    }
}
