public class EquilibriumPointGFG {
    public static int equilibriumPoint(long arr[]) {
        long sum=0;
        for(int i=0;i<arr.length;i++){
            sum=sum+arr[i];
        }
        long sm=0;
        sum=sum-arr[0];
        if(sum==sm){
            return 1;
        }
        for(int i=0;i<arr.length-1;i++){
            sum=sum-arr[i+1];
            sm=sm+arr[i];
            if(sm==sum){
                return i+2;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        long arr[] = {1, 3, 5, 2, 2};
        System.out.println(equilibriumPoint(arr));
    }
}
