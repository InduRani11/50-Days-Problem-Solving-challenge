/*
 * Given an array arr of size n−1 that contains distinct integers in the range of 1 to n (inclusive),
 *  find the missing element. The array is a permutation of size n with one element missing. 
 * Return the missing element.
 */
public class MissingAnArrayGFG {
    public static int missingNumber(int n, int arr[]) {
        int sum=0;
        int arSum=0;
        for(int i=1;i<=n;i++){
            sum+=i;
        }
        for(int i=0;i<n-1;i++){
            arSum+=arr[i];
        }
        return sum-arSum;
    }
    public static void main(String arg[]){
        int n = 5;
        int arr[] = {1,2,3,5};
        missingNumber(n,arr);
    }
}
