public class TrappingRainWaterGFG {
    public static long trappingWater(int arr[]) {
        int n=arr.length;
        int left[]=new int[n];
        int right[]=new int[n];
        int max=0;
        for(int i=0;i<n;i++){
            max=Math.max(arr[i],max);
            left[i]=max;
        }
        max=0;
        for(int i=n-1;i>=0;i--){
            max=Math.max(arr[i],max);
            right[i]=max;
        }
        long tpwtr=0;
        for(int i=0;i<n;i++){
            tpwtr=tpwtr+Math.min(left[i],right[i])-arr[i];
        }
        return tpwtr;
    }
    public static void main(String arg[]){
        int arr[] = {3,0,0,2,0,4};
        System.out.println(tappingWater(arr));
    }

    private static boolean tappingWater(int[] arr) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
