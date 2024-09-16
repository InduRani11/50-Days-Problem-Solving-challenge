import java.util.*;

public class HeightCheckerLC {
    public static int heightChecker(int[] heights) {
        int n=heights.length;
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=heights[i];
        }
        Arrays.sort(heights);
        int count=0;
        for(int i=0;i<n;i++){
            if(arr[i]!=heights[i]){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int heights[] = {1,1,4,2,1,3};
        System.out.println(heightChecker(heights));
    }
}
