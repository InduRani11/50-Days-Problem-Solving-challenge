public class TrapingRainWaterLC {
    public static int trap(int[] height) {
        int n=height.length;
        int lht[]=new int[n];
        int rht[]=new int[n];
        int max=0;
        for(int i=0;i<n;i++){
            max=Math.max(max,height[i]);
            lht[i]=max;

        }
        max=0;
        for(int i=n-1;i>=0;i--){
            max=Math.max(max,height[i]);
            rht[i]=max;

        }
        int trapwater=0;
        for(int i=0;i<n;i++){
            trapwater=trapwater+Math.min(lht[i],rht[i])-height[i];
        }
        return trapwater;
    }
    public static void main(String[] args) {
        int height[] = {0,1,0,2,1,0,1,3,2,1,2,1};
        System.out.println(trap(height));
    }
}
