

public class ContainerWithMostWaterLC {
    public static int maxArea(int[] height) {
        int i=0,j=height.length-1;
        int maxWater=0;
        while(i<j){
            int ht=Math.min(height[i],height[j]);
            int wt=j-i;
            int currWater=ht*wt;
            maxWater=Math.max(maxWater,currWater);
            if(height[i]<height[j]){
                i++;
            }
            else{
                j--;
            }
        }
        return maxWater;
    }
    public static void main(String[] args) {
        int height[] = {1,8,6,2,5,4,8,3,7};
        System.out.println(maxArea(height));

    }
}
