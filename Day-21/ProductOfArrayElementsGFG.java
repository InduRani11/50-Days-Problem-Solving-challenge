public class ProductOfArrayElementsGFG {
    public static long product(long arr[]) {
        long pr=1;
        for(int i=0;i<arr.length;i++){
            pr=(pr*arr[i])%1000000007;
        }
        return pr%1000000007;
    }
    public static void main(String[] args) {
        long arr[] ={1, 2, 3, 4};
        System.out.println(product(arr));
    }
}
